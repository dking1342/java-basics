public class App {
    public static void main(String[] args) throws Exception {
        
        // assigning values to wrapper class in various data types
        Boolean a = true;
        Character b = "#";
        Integer c = 123;
        Double d = 3.14;
        String e = "kavooce";

        // assigning it this way is called autoboxing
        // now you can use the methods for each of the wrapper

        // this is possible due to unboxing
        if(a == true){
            System.out.println("This is true");
        }
    }
}
