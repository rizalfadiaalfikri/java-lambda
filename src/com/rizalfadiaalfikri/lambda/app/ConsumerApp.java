package com.rizalfadiaalfikri.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {

            @Override
            public void accept(String value) {
                // TODO Auto-generated method stub
                System.out.println(value);
            }

        };

        consumer.accept("Rizal Fadia Al Fikri");
    }
}
