package strategy;

public class MobilePayment implements PaymentStrategy {
    private double amount;

    public MobilePayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("📱 Paid $" + String.format("%.2f", amount) + " via mobile app.");
    }
}