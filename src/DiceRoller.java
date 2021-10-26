import java.util.Random;

public class DiceRoller {

    // global variables for random and number example
    // Random random;
    // int number;

    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll(random,number);
    }

    void roll(Random random, int number){
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

    void rollDice(){
        Random random = new Random();
        int number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}