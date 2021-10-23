import java.util.ArrayList;

public class ForEach{
    public static void main(String[] args) {
        
        String[] animals = {"cat","dog","bird","rabbit"};

        for (String i : animals) {
            System.out.println(i);
        };

        ArrayList<String> birds = new ArrayList<String>();
        birds.add("cardinal");
        birds.add("blue jay");
        birds.add("robin");

        // short hand syntax for the forEach method
        birds.forEach((i) -> System.out.println(i));
    }
}