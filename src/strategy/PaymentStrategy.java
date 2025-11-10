package strategy;

// Strategy interface for different payment methods
public interface PaymentStrategy {

    // Method that every payment type must implement
    void pay(double amount);
}
