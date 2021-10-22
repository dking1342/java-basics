import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int a = random.nextInt();
        System.out.println(a); // random number

        int b = random.nextInt(6); // limits the amount of random range
        System.out.println(b);

        double c = random.nextDouble();
        System.out.println(c); // random double data type

        boolean d = random.nextBoolean();
        System.out.println(d); // random boolean
    }
}
