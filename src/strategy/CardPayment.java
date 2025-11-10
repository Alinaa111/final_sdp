package strategy;

public class CardPayment implements PaymentStrategy {
    private double amount;

    public CardPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("💳 Paid $" + String.format("%.2f", amount) + " with card.");
    }
}
