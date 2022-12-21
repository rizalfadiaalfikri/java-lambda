package com.rizalfadiaalfikri.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Rizal Fadia Al Fikri";

        System.out.println(supplier.get());
    }
}
