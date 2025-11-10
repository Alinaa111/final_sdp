package builder;

import factory.Dish;
import strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

// Represents a customer order
// Integrates Builder, Strategy, and can work with Decorator pattern for dishes
public class Order {

    // List of dishes in this order
    private final List<Dish> dishes = new ArrayList<>();
    private String customer;                 // Customer name
    private double totalPrice;               // Total price of the order
    private PaymentStrategy paymentStrategy; // Payment method (Strategy pattern)

    // Add a dish to the order
    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    // Calculate total price by summing up prices of all dishes
    public double calculateTotalPrice() {
        totalPrice = 0;
        for (Dish dish : dishes) {
            totalPrice += dish.getPrice();
        }
        return totalPrice;
    }

    // Set the payment strategy for this order
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Execute payment using the selected strategy
    public void pay() {
        if (paymentStrategy != null) {
            double total = calculateTotalPrice();
            paymentStrategy.pay(total);
        } else {
            System.out.println("No payment method selected for customer: " + customer);
        }
    }

    // Get detailed string of the order (customer, dishes, total price)
    public String getDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Customer: ").append(customer).append("\n");
        details.append("Ordered dishes:\n");
        for (Dish dish : dishes) {
            details.append(" - ").append(dish.getDescription())
                    .append(" (").append(dish.getPrice()).append(")\n");
        }
        details.append("Total price: ").append(calculateTotalPrice()).append("\n");
        return details.toString();
    }

    // Getter and setter for customer
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    // Getter for the list of dishes
    public List<Dish> getDishes() {
        return dishes;
    }

    // Simple string representation of the order
    @Override
    public String toString() {
        return "Order for " + customer + " (" + dishes.size() + " dishes)";
    }
}
