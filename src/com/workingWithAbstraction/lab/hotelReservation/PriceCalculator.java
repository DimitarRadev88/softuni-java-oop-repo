package com.workingWithAbstraction.lab.hotelReservation;

public class PriceCalculator {

    public static double calculatePrice(double pricePerDay, int numberOfDays, String seasonName, String discountTypeName) {
        Season season = Season.valueOf(seasonName.toUpperCase());
        DiscountType discountType = DiscountType.valueOf(discountTypeName);

        return pricePerDay * numberOfDays * season.getMultiplier() * (100 - discountType.getDiscount()) / 100.00;
    }
}
