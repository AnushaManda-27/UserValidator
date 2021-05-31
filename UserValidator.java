
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class UserValidator {
        private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,20}$" ;
        private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{3,20}$" ;
        private static final String EMAIL_ADDRESS_PATTERN = "^[a-z]{3}[.][a-z]{3}+[@][a-z]{5,10}[.][a-z]{2}[.][a-z]{2}$" ;
        private static final String MOBILE_NUMBER_PATTERN = "^[6-9]{1}[0-9]{9,9}$" ;

        //FirstName Validation check
        public boolean validateFirstName(String FirstName) {
            Pattern p = Pattern.compile(FIRST_NAME_PATTERN) ;
            if (FirstName == null) {
                return false;
            }
            Matcher m = p.matcher(FIRST_NAME_PATTERN);
            return true;

        }

        //LastName Validation check
        public boolean validateLastName(String LastName) {
            Pattern p = Pattern.compile(LAST_NAME_PATTERN) ;
            if (LastName == null) {
                return false;
            }
            Matcher m = p.matcher(LAST_NAME_PATTERN);
            return true;
        }


        //EmailValidation check
        public boolean validateEMAIL_ADDRESS_PATTERN(String Email) {
            Pattern p = Pattern.compile(EMAIL_ADDRESS_PATTERN) ;
            if (Email == null) {
                return false;
            }
            Matcher m = p.matcher(EMAIL_ADDRESS_PATTERN);
            return true;
        }

        //Mobile Validation check
        public boolean validateMOBILE_NUMBER_PATTERN(String Mobile) {
            Pattern p = Pattern.compile(MOBILE_NUMBER_PATTERN) ;
            if (Mobile == null) {
                return false;
            }
            Matcher m = p.matcher(MOBILE_NUMBER_PATTERN);
            return true;
        }

    }

