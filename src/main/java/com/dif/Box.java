package com.dif;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Box {

    public Box(String packageToScanForInjectables) {
        List<String> packageNames = getAllSubPackages(packageToScanForInjectables);
        System.out.println(String.join("\n", packageNames));
        System.out.println(packageNames.size());



        for (String packageName : packageNames) {

            List<String> resourceNamesIn = getResourceNamesIn(packageName);
            List<String> classNames = resourceNamesIn.stream()
                    .filter(endsWithClassSuffix())
                    .toList();

            for (String className : classNames) {
                System.out.println(className);
            }
        }

        //List<String> classNames = reader.lines()
        //        .filter(endsWithClassSuffix())
        //        .toList();


    }

    private static List<String> getAllSubPackages(String basePackage) {
        List<String> resources = getResourceNamesIn(basePackage);

        List<String> packageNames = resources.stream()
                .filter(endsWithClassSuffix().negate())
                .toList();

        List<String> fullyQualifiedPackages = new ArrayList<>();
        fullyQualifiedPackages.add(basePackage);

        if (!packageNames.isEmpty()) {
            for (String packageName : packageNames) {
                String fullPackagePath = basePackage + "." + packageName;
                fullyQualifiedPackages.addAll(getAllSubPackages(fullPackagePath));
            }
        }

        return fullyQualifiedPackages;
    }

    private static List<String> getResourceNamesIn(String packageName) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream(packageName.replaceAll("\\.", "/"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(resourceAsStream));
        return reader.lines().toList();
    }

    private static Predicate<String> endsWithClassSuffix() {
        return line -> line.endsWith(".class");
    }
}
