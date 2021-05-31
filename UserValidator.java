package userreg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserValidator1 {
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,20}$" ;
    private static final String EMAIL_ADDRESS_PATTERN = "^(?=.{1,64}@)[A-Z a-z]+(\\\\.[A-Z a-z 0-9_-]+)@[A-Z a-z 0-9_-]+(\\\\.[A-Za-z0-9-]+)(\\\\.[A-Za-z]{2,})$";
    private static final String MOBILE_NUMBER_PATTERN = "^[7-9]{1}[0-9]{9,9}$" ;
    private static final String PASSWORD_PATTERN = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$" ;



    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }


    public boolean validateEmailAddress(String email) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validateMobileNumber(String mobile) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobile).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
