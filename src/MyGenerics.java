public class MyGenerics {

    // old way without generics
    // creating global variables that are arrays of different data types
    Integer[] intArr = {1,2,3,4,5};
    Double[] doubleArr = {5.5, 4.4, 3.3, 2.2, 1.1};
    Character[] charArr = {'k','a','v','o','o','c','e'};
    String[] strArr = {"S","T","R"};        
    
    MyGenerics(){
        
    }

    // methods would be needed without generics
    // method would need to be made for each data type
    // method for integer
    public static void displayArray(Integer[] array) {
        for (Integer x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // method that works with a generic
    // T is the naming convention used for a generic
    public static <T> void displayArr(T[] array) {
        for (T x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // method that works with a generic but outputs something
    // T is used for the output this time instead of void
    public static <T> T getFirst(T[] array){
        return array[0];
    }
}