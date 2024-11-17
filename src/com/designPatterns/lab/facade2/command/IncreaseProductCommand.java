package com.designPatterns.lab.facade2.command;

import com.designPatterns.lab.facade2.product.Product;

public class IncreaseProductCommand implements Command {
    private final Product product;
    private final int amount;

    public IncreaseProductCommand(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    @Override
    public String executeAction() {
        product.increasePrice(amount);
        return String.format("The price for the %s has been increased by %d$",
                this.product.getName(), amount);
    }

}
