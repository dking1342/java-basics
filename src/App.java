public class App {
    public static void main(String[] args) throws Exception {
        
        Car car1 = new Car("Ford","Focus",2020);
        Car car2 = new Car("Chevy","Corvette",2000);

        // copy- not correct
        // car2 = car1; // you do not want to do this

        // copy- correct: after instantiation
        car2.copy(car1);
        // copy- correct: during instantiation
        Car car3 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
        

    }
}
