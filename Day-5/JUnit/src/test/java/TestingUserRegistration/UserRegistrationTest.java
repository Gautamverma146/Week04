package TestingUserRegistration;

import static org.junit.jupiter.api.Assertions.*;

import com.titWeek4Day5GautamJUnit.TestingUserRegistration.UserRegistration;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password1"));
    }

    @Test
    void testShortUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("Jo", "john.doe@example.com", "Password1");
        });
        assertEquals("Username must be at least 3 characters long.", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("JohnDoe", "invalid-email", "Password1");
        });
        assertEquals("Invalid email format.", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Pass1");
        });
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", exception.getMessage());
    }

    @Test
    void testPasswordWithoutUppercase() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "password1");
        });
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", exception.getMessage());
    }

    @Test
    void testPasswordWithoutDigit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password");
        });
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", exception.getMessage());
    }

    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser(null, "john.doe@example.com", "Password1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", null, "Password1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john.doe@example.com", null));
    }
}

