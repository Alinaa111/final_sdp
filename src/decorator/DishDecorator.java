package decorator;

import factory.Dish;

// Base decorator class that extends Dish
public abstract class DishDecorator extends Dish {

    // The original dish object being wrapped
    protected Dish decoratedDish;

    // Constructor accepts a dish to decorate
    public DishDecorator(Dish dish) {
        // Pass base values to the parent (Dish) constructor
        super(dish.getName(), dish.getPrice());
        this.decoratedDish = dish;
    }

    // All decorators must override the description method
    @Override
    public abstract String getDescription();

    // All decorators must override the price method
    @Override
    public abstract double getPrice();
}
