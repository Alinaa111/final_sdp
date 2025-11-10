package strategy;

public class CardPayment implements PaymentStrategy {
    private double amount;

    public CardPayment() {}

    public CardPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("💳 Paid $" + amount + " with card.");
    }
}
