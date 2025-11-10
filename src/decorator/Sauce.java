package decorator;

import factory.Dish;

// Concrete decorator that adds sauce to the dish
public class Sauce extends DishDecorator {

    // Constructor receives the dish to decorate
    public Sauce(Dish dish) {
        super(dish);
    }

    // Adds "Sauce" to the existing dish description
    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + ", Sauce";
    }

    // Adds sauce cost (0.8) to the base dish price
    @Override
    public double getPrice() {
        return decoratedDish.getPrice() + 0.8;
    }
}
