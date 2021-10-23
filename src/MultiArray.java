public class MultiArray{
    public static void main(String[] args) {
        
        // declaring a multi dimensional array        
        String[][] cars = new String[3][3];
        // inserting values into the multi dimensional array
        cars[0][0] = "Camero";
        cars[0][1] = "Corvette";
        cars[0][2] = "Suburu";
        cars[1][0] = "Mustang";
        cars[1][1] = "Prius";
        cars[1][2] = "Corrola";
        cars[2][0] = "Porche";
        cars[2][1] = "Neon";
        cars[2][2] = "Ford";

        // nested loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j <cars[i].length ; j++) {
                System.out.println(cars[i][j]);
            }
        }

        String [][]trucks = {
            {"Ford","Chevy","GMC"},
            {"Ranger","Jeep","Semi"},
            {"Tesla","Silverado","Goo"}
        };
        for (int i = 0; i < trucks.length; i++) {
            System.out.println();
            for (int j = 0; j < trucks[i].length; j++) {
                System.out.println(trucks[i][j]);
            }
        }
    }
}