public class App {
    public static void main(String[] args) throws Exception {
        
        Friend friend1 = new Friend("Jack");
        Friend friend2 = new Friend("Jill");
        Friend friend3 = new Friend("Jon");

        // accessing the static variable using the class that owns the static variable
        System.out.println(Friend.numberOfFriends);

        // if there is not a static variable then it cannot be accessed with the class
        // you would need to access the variable using the instantiated variable
        
        // using static methods in the Friend class
        // use the class name followed by the static method
        Friend.displayFriends();

    }
}
