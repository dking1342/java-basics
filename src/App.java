public class App {
    public static void main(String[] args) throws Exception {
        
        // first instantiate the objects
        Garage garage = new Garage();
        Car car1 = new Car("Focus");
        Car car2 = new Car("Tesla");

        // the garage has a park that you can use with the car
        garage.park(car1);
        garage.park(car2);
    }
}
