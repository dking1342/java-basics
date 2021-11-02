import java.util.function.Function;
import java.util.*;
import java.time.*;

public interface CustomerRegistrationValidator extends Function<_Combinator,CustomerRegistrationValidator.ValidationResult> {

    public static CustomerRegistrationValidator isEmailValid(){
        return customer -> 
            customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    public static CustomerRegistrationValidator isPhoneValid(){
        return customer -> 
            customer.getPhone().contains("+0") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NOT_VALID;
    }

    public static CustomerRegistrationValidator isAdult(){
        return customer -> {
            boolean isDateOfBirth = Period.between(customer.getDob(),LocalDate.now()).getYears() > 16;
            return isDateOfBirth ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_ADULT;
        };
    }

    public default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }


    public static enum ValidationResult {
        SUCCESS,
        PHONE_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_ADULT
    }
}