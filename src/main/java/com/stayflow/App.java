package com.stayflow;

import com.stayflow.util.PriceCalculator;

import java.math.BigDecimal;

public class App {

    public static final String NAME = "StayFlow ";
    public static final String VERSION = "0.1.0";

    public static void main(String[] args) {
        System.out.println(NAME + VERSION);
        if (args.length == 0) {
            System.out.println("Nie podano argumentów. Przykład: --env=dev");
        } else {
            for (String arg : args) {
                System.out.println("Argument: " + arg);
            }
        }

        System.out.println(PriceCalculator.total(new BigDecimal("199.99"), 3));
        System.out.println(PriceCalculator.total(new BigDecimal("350.00"), 1));
        System.out.println(PriceCalculator.total(new BigDecimal("89.50"), 30));
    }
}
