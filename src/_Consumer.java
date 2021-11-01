import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class _Consumer {
    public static void main(String[] args) {

        // create a customer variable
        Customer customer1 = new Customer("Jack","123");
        Customer customer2 = new Customer("Jill","456");
        Customer customer3 = new Customer("Joe","789");
        Customer customer4 = new Customer("Jonah","789");

        // using normal java method
        greetCustomer(customer1);

        // using consumer functional interface
        greetCustomerConsumer.accept(customer2);

        // using biconsumer functional interface
        greetCustomerBiConsumer.accept(customer3,true);
        greetCustomerBiConsumer.accept(customer4,false);
    }

    // creating a customer class
    static class Customer {
        private final String customerName;
        private final String customerPhone;

        Customer(String customerName, String customerPhone){
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }

    // method for the customer class
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + " thanks for registering on phone " + customer.customerPhone);
    }
    
    // Consumer functional interface
    static Consumer<Customer> greetCustomerConsumer = customer -> 
        System.out.println("Hello " + customer.customerName + " thanks for registering on phone " + customer.customerPhone);

    
    // BiConsumer functional interface
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, isShowing) ->
        System.out.println(
            "Hello " + customer.customerName + 
            " thanks for registering on phone " +
            (isShowing ? customer.customerPhone : "*****") // use of a ternary operator           
        );
}