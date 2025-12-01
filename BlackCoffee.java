// Concrete Component
public class BlackCoffee implements Coffee {
    double cost = 100.00;
    @Override
    public String getDescription() {
        return "Black Coffee";
    }

    @Override
    public double getCost() {
        return cost;
    }
}
