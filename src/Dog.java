public class Dog extends Animal{


    // good practice to add @Override before the overridden method
    @Override
    void speak(){
        System.out.println("The dog barks");
    }
}