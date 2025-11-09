package factory;

/**
 * Concrete dish type representing a starter.
 */
public class Starter extends Dish {
    public Starter(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Starter: " + name;
    }
}
