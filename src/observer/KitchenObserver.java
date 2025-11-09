package observer;

import builder.Order;

public class KitchenObserver implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("[Kitchen] New order received:");
        System.out.println(order.getDetails());
    }
}
