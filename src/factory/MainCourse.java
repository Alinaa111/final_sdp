package factory;

/**
 * Concrete dish type representing a main course.
 */
public class MainCourse extends Dish {
    public MainCourse(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Main course: " + name;
    }
}
