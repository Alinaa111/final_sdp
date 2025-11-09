package builder;

import factory.Dish;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Dish> dishes = new ArrayList<>();
    private String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public String getCustomer() {
        return customer;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    @Override
    public String toString() {
        return "Order for " + customer + " (" + dishes.size() + " dishes)";
    }
}
