package com.solid.lab.openClosedPrinciple.shoppingCart;

public class OnlineOrder extends Order {

    protected OnlineOrder(int customerId, CustomerRepository customerRepository, OrderRepository orderRepository) {
        super(customerId, customerRepository, orderRepository);
    }

}
