package com.rizalfadiaalfikri.lambda.app;

import com.rizalfadiaalfikri.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        // SimpleAction simpleAction = new SimpleAction() {

        // @Override
        // public String action(String name) {
        // // TODO Auto-generated method stub
        // return name;
        // }

        // };

        // System.out.println(simpleAction.action("Rizal"));

        // SimpleAction simpleAction2 = (String name) -> {
        // return name;
        // };

        // System.out.println(simpleAction2.action("Rizal"));

        SimpleAction simpleAction = (String name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction3 = (String name) -> "Hello " + name;
        SimpleAction simpleAction4 = (name) -> "Hello " + name;
        SimpleAction simpleAction5 = name -> "Hello " + name;

    }
}
