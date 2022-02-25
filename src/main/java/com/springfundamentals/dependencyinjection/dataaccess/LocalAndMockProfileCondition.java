package com.springfundamentals.dependencyinjection.dataaccess;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.List;

import static java.util.Arrays.asList;

public class LocalAndMockProfileCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        List<String> activeProfiles = asList(context.getEnvironment().getActiveProfiles());
        return activeProfiles.contains("local") && activeProfiles.contains("mock");
    }
}
