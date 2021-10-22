public class App {
    public static void main(String[] args) throws Exception {
        
        // conditional using the if, then statement
        int age = 15;

        // when making your conditional statements then the sequence matters. The first truthy value will return the block of code in that closure.

        if(age >= 18){
            System.out.println("You are an adult");
        } else if(age >= 75){
            System.out.println("You are a senior citizen");
        } else {
            System.out.println("You are a child");
        }

        // you can use the && to see if both values are true
        // you can use the || to see if one of the other values are true

        if(age >= 75){
            System.out.println("You are a senior citizen");
        } else if(age >= 18 && age < 75){
            System.out.println("You are an adult");
        } else if(age >= 13 && age < 18){
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a child");
        }

        // conditional using switch
        String day = "Friday";

        switch (day) {
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Please enter a valid day of the week!");
                break;
        }
    }
}
