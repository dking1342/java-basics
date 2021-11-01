import java.util.function.Function;
import java.util.function.BiFunction;

public class _Function {
    public static void main(String[] args) {
        // using a method
        int inc = increment(1);
        System.out.println(inc);

        // using a function
        int inc2 = incrementByFunction.apply(3);
        System.out.println(inc2);

        // using a function
        int multiply = multiplyByFunction.apply(inc2);
        System.out.println(multiply);

        // using chaining of functions
        int chaining = funcChain.apply(5);
        System.out.println(chaining);

        // using a bifunction
        int biFunc = biFunctionExample.apply(5,3);
        System.out.println(biFunc);

    }
    
    // method that increments an integer
    static int increment(int num) {
        return num + 1;
    }

    // function that increments an integer
    static Function<Integer,Integer> incrementByFunction = number -> number += 1;

    // function that multiplies the numbers
    static Function<Integer, Integer> multiplyByFunction = number -> number * 10;

    // function that chains other functions
    static Function<Integer, Integer> funcChain = incrementByFunction.andThen(multiplyByFunction);

    // method that has two operations - alternate to bifunction
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

    // bifunction that takes in multiple parameters and an output
    static BiFunction <Integer, Integer, Integer> biFunctionExample = (
        numberToIncrement, numberToMultiply
    ) -> (numberToIncrement + 1) * numberToMultiply;

}