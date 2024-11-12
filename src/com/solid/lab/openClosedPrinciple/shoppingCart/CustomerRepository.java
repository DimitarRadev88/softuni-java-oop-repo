package com.solid.lab.openClosedPrinciple.shoppingCart;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {
    private Map<Integer, Customer> customerMap;

    public CustomerRepository() {
        this.customerMap = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customerMap.putIfAbsent(customer.getCustomerId(), customer);
    }

    public Customer getCustomer(int id) {
        return customerMap.get(id);
    }

}
