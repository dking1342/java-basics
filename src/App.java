import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Animal animal; // creates a place in memory until it can be declared

        System.out.println("What animal do you want? ");
        System.out.println("1 is dog and 2 is cat: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        } else if(choice == 2){
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("Invalid choice");
            animal.speak();
        }
    }
}
