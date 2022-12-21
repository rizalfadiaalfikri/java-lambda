package com.rizalfadiaalfikri.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForeachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Rizal", "Fadia", "Al", "Fikri");

        // for loop
        for (var value : list) {
            System.out.println(value);
        }

        System.out.println("=========================");

        // Foreach dengan anonymous class
        list.forEach(new Consumer<String>() {

            @Override
            public void accept(String t) {
                // TODO Auto-generated method stub
                System.out.println(t);
            }

        });

        // lambda
        list.forEach(value -> System.out.println(value));

        System.out.println("=========================");

        // lambda method reference
        list.forEach(System.out::println);

    }
}
