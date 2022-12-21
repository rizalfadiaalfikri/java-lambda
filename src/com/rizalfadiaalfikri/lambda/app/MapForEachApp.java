package com.rizalfadiaalfikri.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("first_name", "Rizal");
        map.put("middle_name", "Fadia Al");
        map.put("last_name", "Fikri");

        // for loop
        for (var entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
        }

        System.out.println("=================");

        // foreach anonymous class
        map.forEach(new BiConsumer<String, String>() {

            @Override
            public void accept(String key, String value) {
                // TODO Auto-generated method stub
                System.out.println("Key: " + key + "  Value: " + value);
            }

        });

        System.out.println("=================");

        // lambda
        map.forEach((key, value) -> System.out.println("Key: " + key + "  Value: " + value));

    }
}
