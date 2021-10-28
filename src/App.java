import java.util.ArrayList;
import java.util.HashMap;

public class App {

    public static void main(String[] args) throws Exception {

        // example using generic methods
        MyGenerics myGeneric = new MyGenerics();

        // old way without generics
        myGeneric.displayArray(myGeneric.intArr);

        // new way with generics
        // now all data types can be run inside the generic method
        myGeneric.displayArr(myGeneric.intArr);
        myGeneric.displayArr(myGeneric.doubleArr);
        myGeneric.displayArr(myGeneric.charArr);
        myGeneric.displayArr(myGeneric.strArr);

        // new way with generics that returns an output
        System.out.println(myGeneric.getFirst(myGeneric.intArr));

        // example using generic classes
        // without generics
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(1);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("kavooce");
        
        System.out.println("the MyIntegerClass outputs " + myInt.getValue());
        System.out.println("the MyDoubleClass outputs " + myDouble.getValue());
        System.out.println("the MyCharacterClass outputs " + myChar.getValue());
        System.out.println("the MyStringClass outputs " + myString.getValue());
        
        // with generics
        // might need to add <> after instanting in case of error
        MyGen<Integer> myGenInt = new MyGen(2);
        MyGen<Double> myGenDouble = new MyGen(3);
        MyGen<Character> myGenChar = new MyGen('$');
        MyGen<String> myGenString = new MyGen("kaboose");

        System.out.println("the generic class outputs " + myGenInt.getValue());
        System.out.println("the generic class outputs " + myGenDouble.getValue());
        System.out.println("the generic class outputs " + myGenChar.getValue());
        System.out.println("the generic class outputs " + myGenString.getValue());

        // example with an ArrayList
        // uses the <> as it is using generics, generic class
        // you do not need different array lists for different data class
        ArrayList<String> myFriends = new ArrayList<>();
        ArrayList<Integer> myNumber = new ArrayList<>();

        // example of generic with multiple parameters
        MyMultiGenClass<Integer, Integer> myMultiGenInt = new MyMultiGenClass(1,2);
        MyMultiGenClass<Double, Double> myMultiGenDouble = new MyMultiGenClass(1.01,2.02);
        MyMultiGenClass<Character, Character> myMultiGenChar = new MyMultiGenClass('!','@');
        MyMultiGenClass<String, Character> myMultiGenString = new MyMultiGenClass("Hello",'%');

        System.out.println("The second value is " + myMultiGenInt.getSecondValue());
        System.out.println("The second value is " + myMultiGenDouble.getSecondValue());
        System.out.println("The second value is " + myMultiGenChar.getSecondValue());
        System.out.println("The second value is " + myMultiGenString.getSecondValue());

        // example using a hash map
        // HashMap<Integer,String> users = new HashMap(1,"kavooce");
    }


}
