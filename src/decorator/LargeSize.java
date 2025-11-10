package decorator;

import factory.Dish;

public class LargeSize extends DishDecorator {
    public LargeSize(Dish dish) {
        super(dish);
    }

    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + ", Large Size";
    }

    @Override
    public double getPrice() {
        return decoratedDish.getPrice() * 1.5;
    }
}