// abstract is used which makes this not possible to instatiate
public abstract class Vehicle {

    // forces us to implement this in a child class
    // not possible to call the go method with the Vehicle class
    abstract void go();
}