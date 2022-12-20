package com.rizalfadiaalfikri.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = t -> t.isBlank();

        System.out.println(predicate.test("Rizal"));
        System.out.println(predicate.test(""));

    }
}
