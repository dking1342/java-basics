import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int temp = 25;

        // && and
        if(temp > 30){
            System.out.println("It is hot");
        } else if(temp >= 20 && temp <= 30){
            System.out.println("It is pleasant");
        } else {
            System.out.println("It is chilly");
        }

        // || or
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        // if both are equal
        // if(response.equals("q") || response.equals("Q")){
        //     System.out.println("You quit the game");
        // } else {
        //     System.out.println("You are still playing the game");
        // }

        if(!response.equals("q") || !response.equals("Q")){
            System.out.println("You are still playing");

        } else {
            System.out.println("Thanks for playing. Please come back soon!");
        }
    }
}
