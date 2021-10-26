public class App {
    public static void main(String[] args) throws Exception {
        
        Animal animal = new Animal();
        Dog dog = new Dog();

        // both are using the speak method but the dog class overrides it
        animal.speak();
        dog.speak();
    }
}
