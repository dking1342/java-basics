import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
    
        // normal way
        System.out.println("normal way");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000000000"));
        System.out.println(isPhoneNumberValid("0900000000"));
        
        // predicates
        System.out.println("predicate way");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0900000000"));

        // chaining predicates
        System.out.println("chaining predicates with and, or ");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07030000000"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000"));
        
    }

    // using normal parameters to check a condition
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
    
    // using a predicate
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> 
        phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
        phoneNumber.contains("3");

}