public class App {
    public static void main(String[] args) throws Exception {
        
        Car car = new Car("Ford","Focus",2020);

        // cannot access these attributes because it is private
        // System.out.println(car.make);
        // System.out.println(car.model);
        // System.out.println(car.year);
        
        // cannot set the object this way
        // car.make = "Chevy"

        // use the getter method to display 
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        // use the setter method
        car.setMake("Chevy");
        car.setModel("Camero");
        car.setYear(1969);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
