public class App {
    public static void main(String[] args) throws Exception {
        
        // pie variable can be updated
        double pie = 3.141559;
        pie = 4.55555;
        System.out.println(pie);

        // final will freeze the variable and no updates are allowed
        // naming convension for final keyword is to capitalize it
        final double PI = 3.14159;

        System.out.println(PI);
    }
}
