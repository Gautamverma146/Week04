package ParameterizedTests;

import static org.junit.jupiter.api.Assertions.*;

import com.titWeek4Day5GautamJUnit.ParameterizedTests.NumberEvenOrNot;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestingNumberEvenOrNot {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testIsEven_withEvenNumbers(int number) {
        assertTrue(NumberEvenOrNot.isEven(number), number + " should be even.");
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEven_withOddNumbers(int number) {
        assertFalse(NumberEvenOrNot.isEven(number), number + " should not be even.");
    }
}

