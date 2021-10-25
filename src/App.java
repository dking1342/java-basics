public class App {
    public static void main(String[] args) throws Exception {
        
        // working with a class without a constructor
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        myCar1.drive();
        myCar1.brake();
        System.out.println();

        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        myCar2.drive();
        myCar2.brake();
        System.out.println();

        // working with a class that has a constructor
        CarConstructor myCar3 = new CarConstructor("Chevy","Camero",2015,"red",50000.00);
        System.out.println(myCar3.make);
        System.out.println(myCar3.model);
        System.out.println(myCar3.year);
        System.out.println(myCar3.color);
        System.out.println(myCar3.price);
        myCar3.speed();
        myCar3.brake();
        System.out.println();

        CarConstructor myCar4 = new CarConstructor("Toyota","Accord",2017,"blue",40000.00);
        System.out.println(myCar4.make);
        System.out.println(myCar4.model);
        System.out.println(myCar4.year);
        System.out.println(myCar4.color);
        System.out.printf("$%,.2f",myCar4.price); // formatting for the price
        System.out.println();
        myCar4.speed();
        myCar4.brake();


    }
}
