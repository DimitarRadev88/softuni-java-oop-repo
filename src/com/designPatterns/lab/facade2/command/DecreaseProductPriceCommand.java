package com.designPatterns.lab.facade2.command;

import com.designPatterns.lab.facade2.product.Product;

public class DecreaseProductPriceCommand implements Command {
    private final Product product;
    private final int amount;

    public DecreaseProductPriceCommand(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    @Override
    public String executeAction() {
        product.decreasePrice(amount);
        return String.format("The price for the %s has been reduced by %d$.",
                product.getName(), amount);
    }

}
