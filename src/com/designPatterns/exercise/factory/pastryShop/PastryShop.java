package com.designPatterns.exercise.factory.pastryShop;

import com.designPatterns.exercise.factory.cake.Cake;
import com.designPatterns.exercise.factory.factory.CakeFactory;

public class PastryShop {

    private CakeFactory cakeFactory;

    public PastryShop(CakeFactory cakeFactory) {
        this.cakeFactory = cakeFactory;
    }

    public Cake placeOrder(String type) {
        return cakeFactory.getCake(type);
    }

}
