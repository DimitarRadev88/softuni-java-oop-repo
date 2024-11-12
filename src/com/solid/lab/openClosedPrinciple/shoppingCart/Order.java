package com.solid.lab.openClosedPrinciple.shoppingCart;

public abstract class Order {
    private int customerId;
    private static int orderId;
    private OrderRepository orderRepository;
    private CustomerRepository customerRepository;

    protected Order(int customerId, CustomerRepository customerRepository, OrderRepository orderRepository) {
        orderId++;
        this.customerId = customerId;
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
    }

    public double getTotalAmount() {
        double total = 0;

        Iterable<OrderItem> items = customerRepository.getCustomer(customerId).getCart().getItems();

        for (OrderItem item : items) {
            total += ItemPriceCalculator.calculatePrice(item.getSku(), item.getQuantity());
        }

        return total;
    }

    void checkout() {
        Cart cart = customerRepository.getCustomer(customerId).getCart();
        orderRepository.addOrder(orderId, cart);
        cart.clear();
    }

}
