public class App {
    public static void main(String[] args) throws Exception {
        
        // inserting values inside the array
        String[] cars = new String[3];
        cars[0] = "Camero";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // array and inserting values in the array
        String[] trucks = {"Ford","Chevy","GMC"};

        for (int i = 0; i < trucks.length; i++) {
            System.out.println(trucks[i]);
        }

        int[] nums = {1,2,3,4,5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // making an array with a fixed amount
        String[] foods = new String[3];

        foods[0] = "pizza";
        foods[1] = "mac and cheese";
        foods[2] = "taco";

        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }

    }
}
