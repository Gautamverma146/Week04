package TestingPasswordValidatorStrengthValidator;

import static org.junit.jupiter.api.Assertions.*;

import com.titWeek4Day5GautamJUnit.TestingPasswordStrengthValidator.PasswordValidator;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongPass1"));
    }

    @Test
    void testShortPassword() {
        assertFalse(PasswordValidator.isValid("Abc1"));
    }

    @Test
    void testNoUppercaseLetter() {
        assertFalse(PasswordValidator.isValid("strongpassword1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValid("StrongPassword"));
    }

    @Test
    void testOnlyDigits() {
        assertFalse(PasswordValidator.isValid("12345678"));
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(PasswordValidator.isValid(""));
    }
}
