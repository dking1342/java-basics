public class App {
    public static void main(String[] args) throws Exception {

        // you can instatiate new Pizza objects with varying number 
        // of parameters because of the overloading constructor
        
        Pizza pizza = new Pizza("thick crust","tomato","cheddar","pepperoni");
        System.out.println("These are the pizza ingredients");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings);

        Pizza pizza2 = new Pizza("thin","tomato","cheese");
        System.out.println(pizza2.bread);
    }
}
