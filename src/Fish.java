public class Fish implements Prey, Predator {

    @Override
    public void flee(){
        System.out.println("The fish is fleeing larger fish");
    }

    @Override
    public void hunt(){
        System.out.println("This fish is hunting smaller fish");
    }
}