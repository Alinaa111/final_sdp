package strategy;

// Concrete strategy class for card payment
public class CardPayment implements PaymentStrategy {

    // Stores payment amount (optional usage)
    private double amount;

    // Default constructor
    public CardPayment() {}

    // Constructor that accepts the payment amount
    public CardPayment(double amount) {
        this.amount = amount;
    }

    // Implementation of the pay method from PaymentStrategy interface
    @Override
    public void pay(double amount) {
        System.out.println("💳 Paid $" + amount + " with card.");
    }
}
