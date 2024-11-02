package com.workingWithAbstraction.lab.hotelReservation;

public enum DiscountType {
    VIP(20),
    SecondVisit(10),
    None(0);

    private final int discount;

    DiscountType (int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
