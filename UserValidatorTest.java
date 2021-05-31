package userreg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class UserValidatorTest {

    @Test
    void Proper_FirstName_true() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Anusha");
        assertEquals(true, result);
    }

    @Test
    void Proper_firstname_false() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("An");
        assertEquals(true, result);
    }

    @Test
    void prper_firstname_false1() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Anu@sha");
        assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Manda");
        assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturntrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("123@Manda");
        assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnfalse1() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Manda@1254");
        assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEMAIL_ADDRESS_PATTERN("abc.xyz@bridgelabz.co.in");
        assertEquals(true, result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue1() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEMAIL_ADDRESS_PATTERN("abc@bridgelabz.co.in");
        assertEquals(true, result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnfalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEMAIL_ADDRESS_PATTERN("abc.@.co.in");
        assertEquals(false, result);
    }

    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMOBILE_NUMBER_PATTERN("9876543210");
        assertEquals(true, result);
    }

    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue1() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMOBILE_NUMBER_PATTERN("9589312404");
        assertEquals(true, result);
    }

    @Test
    void givenMobile_WhenProper_ShouldReturnfalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMOBILE_NUMBER_PATTERN("35804");
        assertFalse(result);
    }

    @Test
    void givenMobile_WhenProper_ShouldReturnfalse1() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMOBILE_NUMBER_PATTERN("358000454666592404");
        assertEquals(false, result);
    }
}
