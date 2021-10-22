import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // min and max
        double x = 3.14;
        double y = -10;
        double z = Math.max(x,y);
        System.out.println(z);
        System.out.println(Math.min(x,y));

        // absolute value
        double a = 2.14;
        double b = -10;
        System.out.println(Math.abs(b));

        // square root and powers
        double c = 10;
        System.out.println(Math.sqrt(c));
        System.out.println(Math.pow(c, 3));

        // rounding
        double d = 3.14;
        System.out.println(Math.round(d)); // rounds based on whole number
        System.out.println(Math.ceil(d)); // rounds up
        System.out.println(Math.floor(d)); // rounds down

        // find a hypotenus
        double e;
        double f;
        double g;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side e ");
        e = scanner.nextDouble();
        System.out.println("Enter side f ");
        f = scanner.nextDouble();

        g = Math.sqrt(Math.pow(e,2) + Math.pow(f,2));
        System.out.println("The hypotenus is " + g);
        scanner.close();
    }
}
