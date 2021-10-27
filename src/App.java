public class App {
    public static void main(String[] args) throws Exception {
        
        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bike = new Bicycle();

        Vehicle[] racers = {car, bike, boat};

        // calling individually
        car.go();
        bike.go();
        boat.go();

        // using a loop
        for (Vehicle x : racers) {
            x.go();
        }
    }
}
