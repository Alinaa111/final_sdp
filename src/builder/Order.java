package builder;

import factory.Dish;
import strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Dish> dishes = new ArrayList<>();
    private String customer;
    private double totalPrice;
    private PaymentStrategy paymentStrategy;

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public double calculateTotalPrice() {
        totalPrice = 0;
        for (Dish dish : dishes) {
            totalPrice += dish.getPrice();
        }
        return totalPrice;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        if (paymentStrategy != null) {
            double total = calculateTotalPrice();
            paymentStrategy.pay(total);
        }
        else {
            System.out.println("No payment method selected for customer: " + customer);
        }
    }

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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    @Override
    public String toString() {
        return "Order for " + customer + " (" + dishes.size() + " dishes)";
    }
}
