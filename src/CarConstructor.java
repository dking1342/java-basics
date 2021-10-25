public class CarConstructor {

    String make;
    String model;
    int year;
    String color;
    double price;

    // the constructor will make a blueprint for each unique instance
    CarConstructor(String make,String model,int year,String color, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    void speed(){
        System.out.println("The " + this.model + " is speeding up");
    }

    void brake(){
        System.out.println("The " + this.model + " is slowing down");
    }
}