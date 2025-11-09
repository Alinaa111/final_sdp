package builder;

import factory.Dish;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public OrderBuilder addDish(Dish dish) {
        order.addDish(dish);
        return this;
    }

    public OrderBuilder setCustomer(String name) {
        order.setCustomer(name);
        return this;
    }

    public Order build() {
        return order;
    }
}
