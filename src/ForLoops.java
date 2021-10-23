public class ForLoops {
    public static void main(String[] args) {
        
        // for loop executes a block of code a limited amount of times
        // increment
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // decrement
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Happy new year!");

        // increment or decrement by number other than 1
        for (int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }

    }
}