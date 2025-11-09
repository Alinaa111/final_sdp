package observer;

import builder.Order;

public class WaiterObserver implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("[Waiter] Order is ready for customer notification:");
        System.out.println(order.getDetails());
    }
}
