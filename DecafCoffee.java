
// Concrete Component
public class DecafCoffee implements Coffee {
    double cost = 120.00;
    @Override
    public String getDescription() {
        return "Black Coffee";
    }

    @Override
    public double getCost() {
        return cost;
    }
}
