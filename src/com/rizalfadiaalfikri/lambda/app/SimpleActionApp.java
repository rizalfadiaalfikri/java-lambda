package com.rizalfadiaalfikri.lambda.app;

import com.rizalfadiaalfikri.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction simpleAction = new SimpleAction() {

            @Override
            public String action() {
                // TODO Auto-generated method stub
                return "Rizal";
            }

        };

        System.out.println(simpleAction.action());

        SimpleAction simpleAction2 = () -> {
            return "Rizal";
        };

        System.out.println(simpleAction2.action());

    }
}
