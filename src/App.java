import java.util.Scanner;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
    
            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();
    
            int z = x/y;
    
            System.out.println("Result: " + z);
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a number");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            scanner.close();
            System.out.println("Thanks for playing!");
        }
    }
}
