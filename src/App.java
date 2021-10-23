import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        // creating an arraylist
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("beef");
        food.add("taco");

        // use the size method for array list
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        // useful methods
        // set - updates the value at an index with something else
        food.set(0,"sushi");

        // remove - removes the value from the index search parameter
        food.remove(2);

        // clear - removes all values from the array list
        food.clear();

        // if you need the array list to have a primitive class then you will need to use a wrapper
        ArrayList<Integer> nums = new ArrayList<Integer>();
    }
}
