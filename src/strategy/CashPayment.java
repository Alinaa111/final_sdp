package strategy;

public class CashPayment implements PaymentStrategy {
    private double amount;

    public CashPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("💵 Paid $" + String.format("%.2f", amount) + " in cash.");
    }
}