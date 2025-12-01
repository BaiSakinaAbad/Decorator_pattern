# Brewtiful — Coffee Order Decorator ˗ˏˋ☕ˎˊ˗

Implementation of the Decorator pattern for a coffee shop. Start with a base coffee  (`BlackCoffee` and `DecafCoffee`) and add any combination of decorators (e.g., `Milk`, `CaramelSyrup`) to build an order's description and cost dynamically.

- Component: `Coffee` interface with `getDescription()` and `getCost()`
- Concrete component: `BlackCoffee` (base cost ₱100.00), `DecafCoffee` (base cost ₱120.00)
- Decorator abstraction: `CoffeeDecorator` wraps a `Coffee` instance
- Concrete decorators: `Milk` (+₱25.00), `CaramelSyrup` (+₱40.00)

Usage example (in `Brewtiful.java`):
```
Coffee order = new CaramelSyrup(new Milk(new BlackCoffee()));
System.out.println(order.getDescription()); // Black Coffee, Milk, Caramel Syrup
System.out.println(order.getCost());        // 165.0
```

    /\_/\
  /  • - • \
/ づ ☕ づ  *Gives coffee*

