package src;
import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    // validates the email
    public boolean isEmailValid(String email){
        return email.contains("@");
    }
    // validates the phone
    public boolean isPhoneValid(String phone){
        return phone.contains("+0");
    }
    // validates the age
    public boolean isAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(_Combinator customer){
        return isEmailValid(customer.getEmail()) && 
            isPhoneValid(customer.getPhone()) &&
            isAdult(customer.getDob());
    }

    
}