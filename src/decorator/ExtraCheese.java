package decorator;

import factory.Dish;

// Concrete decorator that adds extra cheese to a dish
public class ExtraCheese extends DishDecorator {

    // Constructor receives the dish to decorate
    public ExtraCheese(Dish dish) {
        super(dish);
    }

    // Adds extra cheese text to the existing description
    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + ", Extra Cheese";
    }

    // Adds extra cost (1.5) for cheese to the base price
    @Override
    public double getPrice() {
        return decoratedDish.getPrice() + 1.5;
    }
}
