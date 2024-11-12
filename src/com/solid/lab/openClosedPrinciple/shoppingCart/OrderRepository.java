package com.solid.lab.openClosedPrinciple.shoppingCart;

import java.util.*;

public class OrderRepository {
    private Map<Integer, List<Iterable<OrderItem>>> orders;

    public OrderRepository() {
        this.orders = new HashMap<>();
    }

    public void addOrder(int orderId, Cart cart) {
        orders.putIfAbsent(orderId, new ArrayList<>());
        orders.get(orderId).add(cart.getItems());
        cart.clear();
    }

}
