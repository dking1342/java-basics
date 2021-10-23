import java.util.*;

public class TwoDArrayList{
    public static void main(String[] args) {

        // 2d array list
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
     
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        System.out.println(bakeryList);

        // get - get a value by the index value
        System.out.println(bakeryList.get(0));

        ArrayList<String> produceList = new ArrayList();
        produceList.add("lettuce");
        produceList.add("beans");
        produceList.add("sprouts");

        System.out.println(produceList);

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("wine");

        System.out.println(drinksList);

        // combine all to one list
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);

        // get an value from the 2d array
        System.out.println(groceryList.get(0)); // this will get the first list
        System.out.println(groceryList.get(0).get(0)); // this will get the first value from the first list
        
    }
}