import java.util.function.*;

public class _Lambdas {
    public static void main(String[] args) {
        
        // example of a lambda or a one liner
        // only having one return statement
        Function<String, String> upperCaseName1 = name -> name.toUpperCase(); // more readable
        upperCaseName1.apply("Jack");

        Function<String, String> upperCaseName2 = String::toUpperCase; // short hand version
        upperCaseName2.apply("Joe");

        // multiple lines
        Function<String, String> upperCaseName3 = name -> {
            // logic
            if(name.isEmpty()) return "name is blank";
            return name.toUpperCase();
        };
        upperCaseName3.apply("Jane");

        // using bifunction and syntax for more parameters
        BiFunction<String,Integer,String> upperCaseName4 = (name, age) -> {
            // logic
            if(name.isEmpty()) return "name is empty";
            System.out.println(age);
            return name.toUpperCase();
        };
        upperCaseName4.apply("Joe",22);
         
    }

    class Service {
        public Consumer<String> test = s -> {
            return s;
        }
    }
}