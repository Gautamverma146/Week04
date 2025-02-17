package Test_StringUtility;

import static org.junit.jupiter.api.Assertions.*;

import com.titWeek4Day5GautamJUnit.TestingStringUtilityMethods.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("avaJ", StringUtils.reverse("Java"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null)); // Null input test
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertTrue(StringUtils.isPalindrome("level"));
        assertTrue(StringUtils.isPalindrome("Noon")); // Case-insensitive check
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(null));  // Null should return false
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("JAVA", StringUtils.toUpperCase("Java"));
        assertEquals("", StringUtils.toUpperCase(""));
        assertNull(StringUtils.toUpperCase(null)); // Null input test
    }
}

