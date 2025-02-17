import static org.junit.jupiter.api.Assertions.*;

import com.titWeek4Day5GautamJUnit.TestingACalculatorClass.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestingCalculator {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

