package factory;

/**
 * Factory Method class that creates different types of dishes.
 * Simplifies dish creation based on a type string.
 */
public class DishFactory {

    // Creates dish depending on given type
    public static Dish createDish(String type, String name, double price) {
        if (type == null) throw new IllegalArgumentException("type cannot be null");

        switch (type.trim().toLowerCase()) {
            case "starter":
                return new Starter(name, price);
            case "main":
            case "maincourse":
            case "main course":
                return new MainCourse(name, price);
            case "dessert":
                return new Dessert(name, price);
            default:
                throw new IllegalArgumentException("Unknown dish type: " + type);
        }
    }
}
