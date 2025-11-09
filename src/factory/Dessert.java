package factory;

/**
 * Concrete dish type representing a dessert.
 */
public class Dessert extends Dish {
    public Dessert(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Dessert: " + name;
    }
}
