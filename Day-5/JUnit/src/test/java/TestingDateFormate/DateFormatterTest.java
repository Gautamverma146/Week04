package TestingDateFormate;

import static org.junit.jupiter.api.Assertions.*;

import com.titWeek4Day5GautamJUnit.TestingDateFormate.DateFormatter;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    @Test
    void testValidDateFormat() {
        assertEquals("15-08-2023", DateFormatter.formatDate("2023-08-15"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("15-08-2023"); // Wrong format
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }

    @Test
    void testInvalidCharacters() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("abcd-ef-gh");
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }

    @Test
    void testEmptyDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("");
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }

    @Test
    void testNullDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate(null);
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }
}
