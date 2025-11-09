package singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import builder.Order;
import observer.Observer;

/**
 * Singleton class that manages all restaurant orders.
 * Keeps a list of orders and notifies observers (like kitchen/waiter).
 */
public final class OrderManager {
    private static volatile OrderManager instance;
    private final List<Order> orders;
    private final List<Observer> observers;

    private OrderManager() {
        this.orders = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    // Thread-safe lazy initialization of Singleton
    public static OrderManager getInstance() {
        if (instance == null) {
            synchronized (OrderManager.class) {
                if (instance == null) {
                    instance = new OrderManager();
                }
            }
        }
        return instance;
    }

    // Adds a new order and notifies all observers
    public synchronized void addOrder(Order order) {
        if (order == null) return;
        orders.add(order);
        notifyObservers(order);
    }

    // Removes an order
    public synchronized void removeOrder(Order order) {
        if (order == null) return;
        orders.remove(order);
    }

    // Returns an unmodifiable list of all orders
    public List<Order> getOrders() {
        return Collections.unmodifiableList(orders);
    }

    // Observer registration
    public synchronized void addObserver(Observer observer) {
        if (observer == null) return;
        if (!observers.contains(observer)) observers.add(observer);
    }

    public synchronized void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifies all observers about a new order
    public void notifyObservers(Order order) {
        List<Observer> snapshot;
        synchronized (this) {
            snapshot = new ArrayList<>(observers);
        }
        for (Observer obs : snapshot) {
            try {
                obs.update(order);
            } catch (Exception ex) {
                System.err.println("Observer update failed: " + ex.getMessage());
            }
        }
    }
}