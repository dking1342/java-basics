public class App {
    public static void main(String[] args) throws Exception {
        
        // some common string methods that are built in

        String name = "kavooce";
        
        // methods
        // equals - checks if values are equal to each other
        boolean result1 = name.equals("joe"); 
        System.out.println(result1);

        // length - returns an integer to display the number of characters in the string
        int result2 = name.length();
        System.out.println(result2);

        // charAt - returns the value of the search parameter
        char result3 = name.charAt(0);
        System.out.println(result3);

        // indexOf - returns the value of the index of the search parameter
        int result4 = name.indexOf("o");
        System.out.println(result4);

        // isEmpty - checks to see if the string is empty or not
        boolean result5 = name.isEmpty();
        System.out.println(result5);

        // toUpperCase - updates the values of the string to upper case
        String result6 = name.toUpperCase();
        System.out.println(result6);

        // toLowerCase - updates the values of the string to lower case
        String result7 = name.toLowerCase();
        System.out.println(result7);

        // trim - removes whitespace in the string
        String result8 = name.trim();
        System.out.println(result8);

        // replace - replaces values of the string with the value of the search parameter
        String result9 = name.replace("o","e");
        System.out.println(result9);

    }
}
