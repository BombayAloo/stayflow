package com.stayflow.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class PriceCalculator {

    public static final BigDecimal VAT_RATE = new BigDecimal("0.08");
    public static final int MIN_NIGHTS = 1;
    public static final int MAX_NIGHTS = 30;

    public PriceCalculator() {
    }

    public static BigDecimal total(BigDecimal pricePerNight, int nights) {
        if (nights < MIN_NIGHTS || nights > MAX_NIGHTS)
            throw new IllegalArgumentException("Liczba nocy musi być w zakresie 1–30, podano: " + nights);
        if (pricePerNight == null || pricePerNight.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Cena nie może być mniejsza lub równa 0");

        BigDecimal net = pricePerNight.multiply(BigDecimal.valueOf(nights));
        return net.multiply(BigDecimal.ONE.add(VAT_RATE)).setScale(2, RoundingMode.HALF_UP);
    }
}
