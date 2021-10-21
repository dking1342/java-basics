public class App {
    public static void main(String[] args) {
        System.out.println("\t'Hello, World!'");
        System.out.print("kavooce is here\n");        
        System.out.println("kavooce is here");   
        // Comments are made this way 
        
        // data types in java ///////////////////////
        // *boolean true or false
        // byte -128 to 127
        // short -32,768 to 32,767
        // *int -2 billion to 2 billion
        // long -9 quntillion to 9 quintillion
        // float fractional number up to 6-7 digits 3.141592f
        // *double fractional number up to 15 digits 3.141592653589793
        // *char single character/letter/ASCII value 'f'
        // *String a sequence of characters "hello world"

        // variables /////////////////

        // int data type
        int x; // declaration
        x = 123; // assignment
        int y = 234; // initialization
        System.out.println(x);
        System.out.println(y);
        System.out.println("My number is: " + x);


        // long data type
        long l = 123456789123456789L; // naming convention to add L at the end

        // float and double data type
        float pi = 3.14f;
        double pid = 3.14159223893059802;

        // boolean data type
        boolean z = true;
        boolean f = false;

        // char and String data types
        char symbol = 'f';
        String name = "kavooce";

        // swapping variables
        String strx = "water";
        String stry = "Kool-Aid";
        String temp;

        System.out.println("strx: " + strx);
        System.out.println("stry: " + stry);

        temp = strx;
        strx = stry;
        stry = temp;
        
        System.out.println("strx: " + strx);
        System.out.println("stry: " + stry);
    }
}
