package com.solid.lab.openClosedPrinciple.shoppingCart;

public class Customer {

    private String username;
    private String email;
    private int customerId;
    private Cart cart;

    public Customer(String username, String email, int customerId, Cart cart) {
        this.username = username;
        this.email = email;
        this.customerId = customerId;
        this.cart = cart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

}

