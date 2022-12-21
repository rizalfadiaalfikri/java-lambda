package com.rizalfadiaalfikri.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Rizal", "Fadia", "Al", "Fikri", "ZAPPS INDONESIA"));

        // remove if anonymous class
        // list.removeIf(new Predicate<String>() {

        // @Override
        // public boolean test(String t) {
        // // TODO Auto-generated method stub
        // return t.length() > 5;
        // }

        // });

        // lambda
        list.removeIf(name -> name.length() > 5);

        System.out.println(list);

    }
}
