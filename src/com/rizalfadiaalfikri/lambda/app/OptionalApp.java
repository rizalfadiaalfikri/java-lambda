package com.rizalfadiaalfikri.lambda.app;

import java.lang.StackWalker.Option;
import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Rizal");
        sayHello(null);
    }

    public static void sayHello(String name) {
        // Optional.ofNullable(name)
        // .map(String::toUpperCase)
        // .ifPresentOrElse(
        // value -> System.out.println("HELLO " + value),
        // () -> System.out.println("HELLO"));

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("HELLO " + upperName);

        // Optional<String> optionalName = Optional.ofNullable(name);
        // Optional<String> optionalStringUpper = optionalName.map(value ->
        // value.toUpperCase());

        // optionalStringUpper.ifPresent(t -> System.out.println("HELLO " + name));
    }
}
