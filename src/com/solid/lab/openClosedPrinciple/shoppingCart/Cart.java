package com.solid.lab.openClosedPrinciple.shoppingCart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    private final List<OrderItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public Iterable<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void add(OrderItem orderItem) {
        this.items.add(orderItem);
    }

    public void remove(OrderItem orderItem) {
        this.items.remove(orderItem);
    }

    public void clear() {
        this.items.clear();
    }

}
