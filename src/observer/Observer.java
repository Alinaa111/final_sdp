package observer;

import builder.Order;


public interface Observer {
    void update(Order order);
}
