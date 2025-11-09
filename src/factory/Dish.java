package factory;

/**
 * Abstract base class for all dishes in the restaurant.
 * Each dish has a name, price, and custom description.
 */
public abstract class Dish {
    protected String name;
    protected double price;

    protected Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public double getPrice() { return price; }

    // Must be implemented by subclasses
    public abstract String getDescription();

    @Override
    public String toString() {
        return String.format("%s — %.2f: %s", name, price, getDescription());
    }
}
