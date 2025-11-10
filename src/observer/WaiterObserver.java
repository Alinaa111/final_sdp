package observer;

import builder.Order;

// Concrete observer class representing a waiter
public class WaiterObserver implements Observer {

    // Called when the subject (order) changes state
    @Override
    public void update(Order order) {
        System.out.println("[Waiter] Order is ready for customer notification:");
        System.out.println(order.getDetails()); // Print order details
    }
}
