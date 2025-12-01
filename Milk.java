// Concrete Decorator - Milk
public class Milk extends CoffeeDecorator {
    double milkCost = 25.00;
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + milkCost;
    }
}
