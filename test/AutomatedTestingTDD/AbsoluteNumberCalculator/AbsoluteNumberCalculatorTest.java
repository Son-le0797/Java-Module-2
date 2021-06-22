package AutomatedTestingTDD.AbsoluteNumberCalculator;

import AutomatedTestingTDD.AbsoluteNumberCalculator.AbsoluteNumberCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    @DisplayName("Absolute of 0")
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Absolute of 0")
    void testFindAbsolute10() {
        int number = 10;
        int expected = 10;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Absolute of 0")
    void testFindAbsoluteOfNegative5() {
        int number = -5;
        int expected = 5;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}