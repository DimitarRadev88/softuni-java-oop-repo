package com.designPatterns.lab.facade2;

import com.designPatterns.lab.facade2.command.Command;
import com.designPatterns.lab.facade2.command.DecreaseProductPriceCommand;
import com.designPatterns.lab.facade2.command.IncreaseProductCommand;
import com.designPatterns.lab.facade2.command.PriceModifier;
import com.designPatterns.lab.facade2.product.Product;

public class Main {
    public static void main(String[] args) {
        PriceModifier modifier = new PriceModifier();
        Product product = new Product("Phone", 500);

        execute(modifier, new IncreaseProductCommand(product, 100));
        execute(modifier, new IncreaseProductCommand(product, 50));
        execute(modifier, new DecreaseProductPriceCommand(product, 100));

        System.out.println(product);
    }

    private static void execute(PriceModifier modifier, Command command) {
        modifier.setCommand(command);
        System.out.println(modifier.invoke());
    }

}
