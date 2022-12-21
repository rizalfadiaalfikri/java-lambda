package com.rizalfadiaalfikri.lambda.app;

import java.util.function.Function;
import java.util.function.Predicate;

import com.rizalfadiaalfikri.lambda.utils.StringUtils;

public class MethodReferenceApp {
    public static void main(String[] args) {
        // Predicate<String> predicateIsLowerCase = t -> StringUtils.isLowerCase(t);
        Predicate<String> predicateIsLowerCase = StringUtils::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Rizal"));
        System.out.println(predicateIsLowerCase.test("rizal"));

        // Method Reference Parameter
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("rizal"));

    }

    public void run() {
        // Predicate<String> predicateIsLowerCase = t -> StringUtils.isLowerCase(t);
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Rizal"));
        System.out.println(predicateIsLowerCase.test("rizal"));
    }

    public void run2() {
        // Predicate<String> predicateIsLowerCase = t -> StringUtils.isLowerCase(t);
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Rizal"));
        System.out.println(predicateIsLowerCase.test("rizal"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
