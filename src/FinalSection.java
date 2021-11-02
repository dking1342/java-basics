import java.util.function.*;

public class FinalSection {
    public static void main(String[] args) {
        
        // example for callbacks
        hello("Jack","Kennedy",null);
        hello("Jack",null,value -> System.out.println("no last name for " + value));
        hello2("Jack",null,()->System.out.println("no last name provided"));
    }

    // using a consumer
    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    // using runnable
    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }

    // javascript cb function example
    // function hello(firstName, lastName, callback) {
    //     console.log(firstName);
    //     if(lastName) {
    //         console.log(lastName);
    //     } else {
    //         callback();
    //     }
    // }
    // hello("Jack",null,function(){console.log("no last name")});
    // hello("Jack","Sprat",function(){console.log("no last name")});
}