public class Brewtiful {
    public static void main(String[] args) {
        // basic black kohi
        Coffee myOrder = new BlackCoffee();
        System.out.println("Order: " + myOrder.getDescription());
        System.out.println("Cost: ₱ " + myOrder.getCost());
        System.out.println();

        //  Milk 
        myOrder = new Milk(myOrder);
        System.out.println("Order: " + myOrder.getDescription());
        System.out.println("Cost: ₱ " + myOrder.getCost());
        System.out.println();

        //  Caramel
        myOrder = new CaramelSyrup(myOrder);
        System.out.println("Order: " + myOrder.getDescription());
        System.out.println("Cost: ₱ " + myOrder.getCost());
        System.out.println();


        // Coffee anotherOrder = new CaramelSyrup(new BlackCoffee());
        // System.out.println("Another Order: " + anotherOrder.getDescription());
        // System.out.println("Cost: ₱ " + anotherOrder.getCost());
    }
}