package com.springfundamentals.dependencyinjection.dataaccess;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LocalAndMockProfileCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        List<String> activeProfiles = asList(context.getEnvironment().getActiveProfiles());
        return activeProfiles.contains("local") && activeProfiles.contains("mock");
    }
}
