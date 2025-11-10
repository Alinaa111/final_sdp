package strategy;

public class MobilePayment implements PaymentStrategy {
    private double amount;

    public MobilePayment() {}

    public MobilePayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("📱 Paid $" + amount + " via mobile app.");
    }
}