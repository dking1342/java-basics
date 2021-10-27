public class App {
    public static void main(String[] args) throws Exception {
        
        // when abstract is used then vehicle cannot be instatiated
        // Vehicle vehicle = new Vehicle(); // not possible

        // child class can be instatiated as it does not have the abstract keyword
        Car car = new Car();
        car.go();
    }
}
