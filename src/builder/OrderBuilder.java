package builder;

import factory.Dish;

// Builder class for creating Order objects using the Builder pattern
public class OrderBuilder {

    // The order being constructed
    private Order order;

    // Initializes a new empty Order
    public OrderBuilder() {
        this.order = new Order();
    }

    // Adds a dish to the order and returns the builder for chaining
    public OrderBuilder addDish(Dish dish) {
        order.addDish(dish);
        return this;
    }

    // Sets the customer name for the order and returns the builder
    public OrderBuilder setCustomer(String name) {
        order.setCustomer(name);
        return this;
    }

    // Returns the fully constructed Order object
    public Order build() {
        return order;
    }
}
