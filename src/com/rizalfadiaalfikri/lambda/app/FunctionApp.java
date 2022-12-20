package com.rizalfadiaalfikri.lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> functionLength = new Function<String, Integer>() {

            @Override
            public Integer apply(String value) {
                // TODO Auto-generated method stub
                return value.length();
            }

        };

        System.out.println(functionLength.apply("Rizal Fadia Al Fikri"));
    }
}
