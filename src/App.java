import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {

        // example setting an optional
        Object value1 = Optional.ofNullable(null)
            .orElseGet(() -> "default value");
        System.out.println(value1);

        // example setting an optional
        Object value2 = Optional.ofNullable("hello")
            .orElseThrow(() -> new IllegalStateException("exception"));
        System.out.println(value2);

        // example setting an optional
        Optional.ofNullable("hello")
            .ifPresent(value -> {
                // can do logic here
                System.out.println(value);
            });

        // example setting an optional
        Optional.ofNullable("jack@example.com")
            .ifPresent(email -> System.out.println("Sent email to " + email));

        // example setting an optional
        // Optional.ofNullable(null)
        //     .ifPresentOrElse(
        //          email -> System.out.println("Sent email to " + email),
        //          () -> System.out.println("Cannot send email"));
        


    }


}
