

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class UserValidator1Test {

    @Test
    void validateFirstName() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateFirstName("Anusha");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateFirstName("an");
        Assertions.assertTrue(result);

    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse1() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateFirstName("@Anusha");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnfalse() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateLastName("27anu");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnfalse12() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateLastName("manda55");
        Assertions.assertFalse(result);
    }


    @Test
    public void givenEmail_WhenEmailValid_ShouldReturnTrue() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateEmailAddress("abc.xyz@bridgelabz.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateEmailAddress("abc@bridgelabz.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnfalse() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateEmailAddress("abc.xyz@.co.in");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue1() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateEmailAddress("abc.12@.com");
        Assertions.assertTrue(result);
    }


    @Test
    public void givenEmail_WhenProper_ShouldReturnfalse12() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateEmailAddress("abc.xyz@.co.net");
        Assertions.assertFalse(result);
    }


    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateMobileNumber("98765432");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue12() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateMobileNumber("9951259086");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobile_WhenProper_ShouldReturnfalse() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateMobileNumber("4786858");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobile_WhenProper_ShouldReturnfalse12() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validateMobileNumber("5285054546592404");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validatePassword("A@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhennotProper_ShouldReturnfalse() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validatePassword("Anushamanda");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhennotProper_ShouldReturnfalse1() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validatePassword("Highway");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhennotProper_ShouldReturnfalse12() {
        UserValidator1 validator = new UserValidator1();
        boolean result = validator.validatePassword("Redandblue32@");
        Assertions.assertTrue(result);
    }
}
