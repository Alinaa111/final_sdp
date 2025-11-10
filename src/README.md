/**
* ================================================================
* 🍽️ RESTAURANT ORDERING SYSTEM
* ================================================================
* A Java console application that simulates a restaurant ordering process
* while demonstrating SIX classic Object-Oriented Design Patterns:
* Singleton, Factory Method, Builder, Observer, Strategy, and Decorator.
*
* ------------------------------------------------
* 📖 OVERVIEW
* ------------------------------------------------
* The system models how a restaurant handles customer orders.
* A customer can order multiple dishes, choose how to pay,
* and the system automatically notifies kitchen and waiter staff.
*
* The program showcases modularity, reusability, and clean architecture
* using design patterns that mirror real-world restaurant behavior.
*
* ------------------------------------------------
* ⚙️ MAIN FLOW
* ------------------------------------------------
* 1. The main entry point (`Main.java`) creates a single instance of
*    `OrderManager` — this class is implemented as a Singleton, meaning
*    only one object of it exists throughout the application.
*
* 2. Two observers are added:
*       - `KitchenObserver` → simulates the kitchen receiving orders
*       - `WaiterObserver`  → simulates the waiter notifying customers
*
* 3. Dishes are created using the Factory Method (`DishFactory`).
*    Depending on the given type ("starter", "main", or "dessert"),
*    the factory returns an appropriate subclass:
*       - `Starter`
*       - `MainCourse`
*       - `Dessert`
*
* 4. The Builder pattern (`OrderBuilder`) is used to construct an `Order`
*    step-by-step by adding dishes and setting the customer name.
*    This avoids constructors with too many parameters and allows
*    flexible order creation.
*
* 5. The Strategy pattern handles payment. The `Order` object accepts
*    a `PaymentStrategy` that defines how the customer pays:
*       - `CashPayment`     → 💵 cash
*       - `CardPayment`     → 💳 card
*       - `MobilePayment`   → 📱 mobile app
*
*    The strategy can be changed at runtime without modifying the `Order` class.
*
* 6. When an order is added to the `OrderManager`, it automatically triggers
*    notifications to all observers (Kitchen and Waiter), showing how the
*    Observer pattern decouples event broadcasting from order logic.
*
* 7. The Decorator pattern (`DishDecorator`) allows additional features
*    to be dynamically added to dishes at runtime, such as:
*       - `ExtraCheese` → adds cheese topping (+$1.50)
*       - `LargeSize`   → increases portion size (x1.5 price)
*       - `Sauce`       → adds extra sauce (+$0.80)
*
*    This pattern enables flexible menu customization without changing
*    the original Dish classes.
*
* ------------------------------------------------
* 🧩 DESIGN PATTERNS SUMMARY
* ------------------------------------------------
* 1. **Singleton** → `OrderManager`
*    - Ensures only one central order manager exists.
*    - Provides thread-safe access to all orders.
*
* 2. **Factory Method** → `DishFactory`
*    - Simplifies object creation.
*    - Avoids using "new" in the client code.
*
* 3. **Builder** → `OrderBuilder`
*    - Builds complex `Order` objects in multiple steps.
*    - Increases readability and flexibility.
*
* 4. **Observer** → `Observer`, `KitchenObserver`, `WaiterObserver`
*    - Provides real-time notifications for new orders.
*    - Promotes loose coupling between system components.
*
* 5. **Strategy** → `PaymentStrategy` and its implementations
*    - Allows multiple interchangeable payment methods.
*    - Follows the Open/Closed Principle (easy to extend).
*
* 6. **Decorator** → `DishDecorator` and its subclasses
*    - Dynamically adds behavior to dishes.
*    - Keeps base classes simple and reusable.
*
* ------------------------------------------------
* 🏗️ PROJECT STRUCTURE
* ------------------------------------------------
* src/
* ├── app/
* │   └── Main.java                // Entry point
* │
* ├── builder/
* │   ├── Order.java               // Represents a customer's order
* │   └── OrderBuilder.java        // Builds Order step-by-step
* │
* ├── factory/
* │   ├── Dish.java                // Abstract base class
* │   ├── Starter.java             // Concrete dish
* │   ├── MainCourse.java          // Concrete dish
* │   ├── Dessert.java             // Concrete dish
* │   └── DishFactory.java         // Factory to create dishes
* │
* ├── decorator/
* │   ├── DishDecorator.java       // Abstract decorator
* │   ├── ExtraCheese.java         // Adds cheese
* │   ├── LargeSize.java           // Enlarges portion
* │   └── Sauce.java               // Adds sauce
* │
* ├── observer/
* │   ├── Observer.java            // Observer interface
* │   ├── KitchenObserver.java     // Kitchen gets updates
* │   └── WaiterObserver.java      // Waiter gets updates
* │
* ├── singleton/
* │   └── OrderManager.java        // Singleton managing all orders
* │
* └── strategy/
*     ├── PaymentStrategy.java     // Strategy interface
*     ├── CashPayment.java         // Pay by cash
*     ├── CardPayment.java         // Pay by card
*     └── MobilePayment.java       // Pay via mobile app
  */
