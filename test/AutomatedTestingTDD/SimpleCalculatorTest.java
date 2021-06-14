package AutomatedTestingTDD;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 1 + 2")
    public void testAdd1And2() {
        int first = 1;
        int second = 2;
        int expected = 3;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 327 + 673")
    public void testAdd327And673() {
        int first = 327;
        int second = 673;
        int expected = 1000;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 5 + 3")
    public void testAdd5And3() {
        int first = 5;
        int second = 3;
        int expected = 8;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 0")
    public void TestSub0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 1")
    public void TestSub0And1() {
        int first = 0;
        int second = 1;
        int expected = -1;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 7 - 3")
    public void TestSub7And3() {
        int first = 7;
        int second = 3;
        int expected = 4;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub -4 - (-7)")
    public void TestSub4And7() {
        int first = -4;
        int second = -7;
        int expected = 3;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
}