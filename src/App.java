public class App {
    public static void main(String[] args) throws Exception {
        
        Rabbit rabbit = new Rabbit(); // implements Prey
        Hawk hawk = new Hawk(); // implements Predator
        Fish fish = new Fish(); // implements both Prey and Predator

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
