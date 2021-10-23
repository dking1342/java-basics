import java.util.Scanner;

public class DoWhile{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // do loop will auto run the first time then it will go into the while loop block of code
        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while (name.trim().isEmpty());
        System.out.println("hello " + name);
    }
}