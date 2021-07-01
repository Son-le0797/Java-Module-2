package AutomatedTestingTDD.FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void checkFizzBuzz() {
        assertEquals("Fizz",FizzBuzz.checkFizzBuzz(31));
    }
}