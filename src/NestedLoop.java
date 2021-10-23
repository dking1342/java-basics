import java.util.Scanner;

public class NestedLoop{
    public static void main(String[] args) {
        
        // nested loops is a loop inside another loop

        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        String symbol = "";

        System.out.println("Enter number of rows: ");
        row = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        col = scanner.nextInt();
        System.out.println("Enter symbol: ");
        symbol = scanner.next();

        // nested loop with i and j as the naming convenion for the variables
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= col; j++) {
                System.out.print(symbol);
            }
        }
    }
}