package decorator;

import factory.Dish;

// Concrete decorator that increases the dish size to Large
public class LargeSize extends DishDecorator {

    // Constructor receives the dish to decorate
    public LargeSize(Dish dish) {
        super(dish);
    }

    // Adds "Large Size" text to the dish description
    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + ", Large Size";
    }

    // Increases the price by 50% for the large size
    @Override
    public double getPrice() {
        return decoratedDish.getPrice() * 1.5;
    }
}
