//package NextDayCalculator;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class NextDayCalculatorTest {
//
//    @Test
//    @DisplayName("Test Case 1:")
//    void findNextDay1() {
//        int day = 1;
//        int month = 1;
//        int year = 2018;
//        String expected = "02/01/2018";
//
//        String result = NextDayCalculator.display(day,month,year);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    @DisplayName("Test Case 2:")
//    void findNextDay2() {
//        int day = 28;
//        int month = 2;
//        int year = 2004;
//        String expected = "29/02/2004";
//
//        String result = NextDayCalculator.display(day,month,year);
//        assertEquals(expected, result);
//    }
//}