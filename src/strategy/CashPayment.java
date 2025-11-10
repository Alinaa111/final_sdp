package strategy;

// Concrete strategy class for cash payment
public class CashPayment implements PaymentStrategy {

    // Stores payment amount (not mandatory but available for future use)
    private double amount;

    // Default constructor
    public CashPayment() {}

    // Constructor that accepts the payment amount
    public CashPayment(double amount) {
        this.amount = amount;
    }

    // Executes the payment using cash
    @Override
    public void pay(double amount) {
        System.out.println("💵 Paid $" + amount + " in cash.");
    }
}
