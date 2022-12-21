package com.rizalfadiaalfikri.lambda.app;

import java.util.function.Predicate;

import com.rizalfadiaalfikri.lambda.utils.StringUtils;

public class MethodReferenceApp {
    public static void main(String[] args) {
        Predicate<String> predicateIsLowerCase = t -> StringUtils.isLowerCase(t);

        System.out.println(predicateIsLowerCase.test("Rizal"));
        System.out.println(predicateIsLowerCase.test("rizal"));
    }
}
