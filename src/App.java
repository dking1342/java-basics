public class App {
    public static void main(String[] args) throws Exception {
        
        // a way to make an array
        int[] number = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[2];

        Food[] fridge = new Food[3];
        Food food1 = new Food("pizza");
        Food food2 = new Food("milk");
        Food food3 = new Food("soda");
        
        // long way to assign values in the array
        fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;

        System.out.println(fridge[0].name);
        System.out.println(fridge[1].name);
        System.out.println(fridge[2].name);
        

        // short version of assigning values to array
        Food[] fridge2 = {food1, food2, food3};
        
        System.out.println(fridge2[0].name);
        System.out.println(fridge2[1].name);
        System.out.println(fridge2[2].name);
    }
}
