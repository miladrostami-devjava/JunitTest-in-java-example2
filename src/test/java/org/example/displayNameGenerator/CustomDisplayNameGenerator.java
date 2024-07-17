package org.example.displayNameGenerator;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class CustomDisplayNameGenerator extends DisplayNameGenerator.Simple {

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        return "Test case: " + testMethod.getName();
    }
}
