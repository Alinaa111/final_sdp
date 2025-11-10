package observer;

import builder.Order;

// Concrete observer representing the kitchen staff
public class KitchenObserver implements Observer {

    // Called when a new order is placed or updated
    @Override
    public void update(Order order) {
        System.out.println("[Kitchen] New order received:");
        System.out.println(order.getDetails()); // Display order details
    }
}
