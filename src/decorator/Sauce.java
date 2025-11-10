package decorator;

import factory.Dish;

public class Sauce extends DishDecorator {
    public Sauce(Dish dish) {
        super(dish);
    }

    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + ", Sauce";
    }

    @Override
    public double getPrice() {
        return decoratedDish.getPrice() + 0.8;
    }
}