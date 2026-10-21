package com.stayflow;

public class App {

    public static final String NAME = "StayFlow ";
    public static final String VERSION = "0.1.0";

    public static void main(String[] args) {
        System.out.println(NAME + VERSION);
        if (args.length == 0) {
            System.out.println("Nie podano argumentów. Przykład: --env=dev");
        } else {
            for (int i =0; i < args.length; i ++) {

                System.out.println("Argument: " + args[i]);
            }
        }
    }
}
