public class App {
    public static void main(String[] args) throws Exception {
        
        boolean myBool = true;
        char myChar = '@';
        String myString = "kavooce";
        int myInt = 50;
        double myDouble = 10000.034;

        // format specifier
        // % [flag] [precision] [width] [conversion-character]
        // %d is for integers
        // %b is for booleans
        // %c is for chars
        // %s is for strings
        // %f is for floats and doubles

        System.out.printf("This is a format string %d",123);
        System.out.println();
        System.out.printf("%b",myBool);
        System.out.println();
        System.out.printf("%c",myChar);
        System.out.println();
        System.out.printf("%s",myString);
        System.out.println();
        System.out.printf("%f",myDouble);
        System.out.println();

        // using width
        // positive will push to the right
        // negative will justify to the left
        System.out.printf("Hello %10s", myString); 
        System.out.println();

        // using precision
        // sets the number of digits of precision when outputting floating-point values
        System.out.printf("You have %.1f cents",myDouble);
        System.out.println();

        // using flags
        // adds an effect to the output based on the flag added to the format specifier
        // - : left-justify
        // + : output a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers are greater than 1000
        System.out.printf("you have this much money %-20f",myDouble);
        System.out.println();
        System.out.printf("you have this much money %020f",myDouble);
        System.out.println();
        System.out.printf("you have this much money %,.2f",myDouble);
    }
}
