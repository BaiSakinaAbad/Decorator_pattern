// Concrete Decorator - CaramelSyrup
public class CaramelSyrup extends CoffeeDecorator {
    double caramelCost = 40.00;

    public CaramelSyrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Caramel Syrup";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + caramelCost;
    }
}
