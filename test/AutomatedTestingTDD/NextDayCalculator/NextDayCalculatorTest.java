package AutomatedTestingTDD.NextDayCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void daysInMonth() {
        assertEquals("2/1/2018",NextDayCalculator.daysInMonth(1,1,2018));
        assertEquals("1/3/2017",NextDayCalculator.daysInMonth(28,2,2017));
        assertEquals("1/1/2019",NextDayCalculator.daysInMonth(31,12,2018));

    }
}