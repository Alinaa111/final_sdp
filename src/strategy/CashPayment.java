package strategy;

public class CashPayment implements PaymentStrategy {
    private double amount;

    public CashPayment() {}

    public CashPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("💵 Paid $" + amount + " in cash.");
    }
}