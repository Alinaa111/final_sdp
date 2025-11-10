package strategy;

// Concrete strategy for mobile app payment
public class MobilePayment implements PaymentStrategy {

    // Optional variable to store amount if needed later
    private double amount;

    // Default constructor
    public MobilePayment() {}

    // Constructor that sets payment amount
    public MobilePayment(double amount) {
        this.amount = amount;
    }

    // Executes payment using a mobile app
    @Override
    public void pay(double amount) {
        System.out.println("📱 Paid $" + amount + " via mobile app.");
    }
}
