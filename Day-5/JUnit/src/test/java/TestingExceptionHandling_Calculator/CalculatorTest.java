package TestingExceptionHandling_Calculator;

import static org.junit.jupiter.api.Assertions.*;

import com.titWeek4Day5GautamJUnit.ExceptionHandling.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testDivide_ValidDivision() {
        assertEquals(5, Calculator.divide(10, 2));
        assertEquals(-3, Calculator.divide(-9, 3));
        assertEquals(0, Calculator.divide(0, 5));
    }

    @Test
    void testDivide_ByZero_ShouldThrowException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
