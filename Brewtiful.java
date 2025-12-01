public class Brewtiful {
    public static void main(String[] args) {
        // basic black kohi
        Coffee myOrder = new BlackCoffee();
        System.out.println("Order: " + myOrder.getDescription());
        System.out.println("Cost: ₱ " + myOrder.getCost() +"\n");
   
        //  Milk 
        myOrder = new Milk(myOrder);
        System.out.println("Order: " + myOrder.getDescription());
        System.out.println("Cost: ₱ " + myOrder.getCost()+"\n");

        //  Caramel
        myOrder = new CaramelSyrup(myOrder);
        System.out.println("Order: " + myOrder.getDescription());
        System.out.println("Cost: ₱ " + myOrder.getCost()+"\n");

        System.out.println("----- New Order -----\n");

        // basic decaf coffee
        Coffee decafOrder = new DecafCoffee();
        System.out.println("Order: " + decafOrder.getDescription());
        System.out.println("Cost: ₱ " + decafOrder.getCost()+"\n");

        // decaf with caramel
        decafOrder = new CaramelSyrup(decafOrder);
        System.out.println("Order: " + decafOrder.getDescription());
        System.out.println("Cost: ₱ " + decafOrder.getCost()+"\n");
    
    }
}