public class App {
    public static void main(String[] args) throws Exception {
        
        Car car = new Car();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);
        System.out.println();

        System.out.println(car); // outputs the car object in memory
        System.out.println(car.toString()); // outputs the car object in memory

        // after overwriting the toString method
        System.out.println(car.toString()); // overwrite the toString method
        System.out.println(car); // since it is overwritten the you can do this
    }
}
