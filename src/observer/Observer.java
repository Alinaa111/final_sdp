package observer;

import builder.Order;

// Observer interface for the Observer pattern
// Any class implementing this interface will be notified of changes in orders
public interface Observer {

    // Method called when the observed Order is updated
    void update(Order order);
}
