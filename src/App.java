public class App {
    public static void main(String[] args) throws Exception {
        
        int friends = 10;

        // first way to perform an operation
        friends = friends + 1; 
        System.out.println(friends);

        // any of the operators can be used to perform a mathematical expression

        // second method to perform an operation that is more concise
        friends++;
        System.out.println(friends);

        // third method to perform an operation which adds more than one
        friends += 10;
        System.out.println(friends);

        // operations with division which will make a float or double data type
        friends = friends / 3;
        System.out.println(friends); // this will only show a whole number

        // to cast the variable to a new data type then you can do it this way
        // friends = (double) friends / 3; // this will cast to a new data type

        double friendz = 10;
        friendz = friendz / 3;
        System.out.println(friendz); // now it will show the correct data type in a fraction

    }
}
