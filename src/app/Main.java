package app;

import builder.Order;
import builder.OrderBuilder;
import decorator.ExtraCheese;
import decorator.LargeSize;
import factory.*;
import observer.*;
import singleton.OrderManager;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        // Creating OrderManager (singleton)
        OrderManager manager = OrderManager.getInstance();

        // Adding observers
        manager.addObserver(new KitchenObserver());
        manager.addObserver(new WaiterObserver());

        // Creating few dishes using Factory
        DishFactory dishFactory = new DishFactory();
        Dish starter = dishFactory.createDish("starter", "Caesar Salad", 5.99);
        Dish main = dishFactory.createDish("main", "Grilled Chicken", 12.50);
        Dish dessert = dishFactory.createDish("dessert", "Chocolate Cake", 4.20);

        // Decorate the main dish (Decorator Pattern)
        main = new ExtraCheese(main); // Adds extra cheese
        main = new LargeSize(main); // Upgrades to large size

        // Building an Order
        OrderBuilder builder = new OrderBuilder();
        Order order = builder.setCustomer("Alina").addDish(starter).addDish(main).addDish(dessert).build();

        // Setting payment method (Strategy)
        order.setPaymentStrategy(new MobilePayment());

        // Adding order to manager (it will notify observers)
        manager.addOrder(order);

        // Showing order details and paying
        System.out.println("\n ORDER SUMMARY");
        System.out.println(order.getDetails());
        order.pay();
    }
}