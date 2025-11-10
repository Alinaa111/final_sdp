package dish;

public class ExtraCheese extends DishDecorator {
    public ExtraCheese(Dish dish) {
        super(dish);
    }

    @Override
    public String getDescription() {
        return decoratedDish.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getPrice() {
        return decoratedDish.getPrice() + 1.5;
    }
}