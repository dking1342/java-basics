import java.time.LocalDate;

public class Store {
    public static void main(String[] args) {
        _Combinator customer = new _Combinator(
            "Jack",
            "jack@example.com",
            "+012345",
            LocalDate.of(2000,1,1)
        );
        
        // without combinator service
        // System.out.println(new CustomerValidatorService().isValid(customer));

        // with combinator pattern with chaining
        CustomerRegistrationValidator.ValidationResult result = 
            CustomerRegistrationValidator.isEmailValid()
            .and(CustomerRegistrationValidator.isPhoneValid())
            .and(CustomerRegistrationValidator.isAdult())
            .apply(customer);

        System.out.println(result);

        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

        // with combinator and lazy load, takes some more configuration
        CustomerRegistrationValidator result2 = 
            CustomerRegistrationValidator.isEmailValid()
            .and(CustomerRegistrationValidator.isPhoneValid())
            .and(CustomerRegistrationValidator.isAdult());

        result2.apply(customer); // the apply method is needed to move forward with any logic
        System.out.println(result2);


        // if valid we can store customer in db
    }


}