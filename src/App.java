import java.util.Scanner; // package that allows a user to input 

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt(); // a new line is not created with this
        scanner.nextLine(); // this will create a new line
        System.out.println("What is your fav food? ");
        String food = scanner.nextLine();
        
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
    }
}
