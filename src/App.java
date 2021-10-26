public class App {
    public static void main(String[] args) throws Exception {
        
        // car inherits vehicle go method
        Car car = new Car();
        car.go();

        // bicycle inherits vehicle stop method
        Bicycle bike = new Bicycle();
        bike.stop();

        // speed variable is there for car and bicycle
        // these variables are common to both child classes
        System.out.println(car.speed);
        System.out.println(bike.speed);

        // variables within a child class are only valid for that class
        // these variables are unique for the child class
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
