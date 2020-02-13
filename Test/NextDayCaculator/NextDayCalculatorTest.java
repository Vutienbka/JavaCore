package NextDayCaculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void nextDayCalculatorTest1(){
        int day =1;
        int month = 1;
        int year = 2018;
        int expectedDay = 2;
        int expectedMonth = 1;
        int expectedYear = 2018;
        int resultDay = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expectedDay,resultDay);
        int resultMonth = NextDayCalculator.getMonth();
        assertEquals(expectedMonth, resultMonth);
        int resultYear = NextDayCalculator.getYear();
        assertEquals(expectedYear,resultYear);
    }
    @Test
    void nextDayCalculatorTest2(){
        int day =31;
        int month = 1;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 2;
        int expectedYear = 2018;
        int resultDay = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expectedDay,resultDay);
        int resultMonth = NextDayCalculator.getMonth();
        assertEquals(expectedMonth, resultMonth);
        int resultYear = NextDayCalculator.getYear();
        assertEquals(expectedYear,resultYear);
    }
    @Test
    void nextDayCalculatorTest3(){
        int day =30;
        int month = 4;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 5;
        int expectedYear = 2018;
        int resultDay = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expectedDay,resultDay);
        int resultMonth = NextDayCalculator.getMonth();
        assertEquals(expectedMonth, resultMonth);
        int resultYear = NextDayCalculator.getYear();
        assertEquals(expectedYear,resultYear);
    }
    @Test
    void nextDayCalculatorTest4(){
        int day =28;
        int month = 2;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 3;
        int expectedYear = 2018;
        int resultDay = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expectedDay,resultDay);
        int resultMonth = NextDayCalculator.getMonth();
        assertEquals(expectedMonth, resultMonth);
        int resultYear = NextDayCalculator.getYear();
        assertEquals(expectedYear,resultYear);
    }

    @Test
    void nextDayCalculatorTest5(){
        int day =31;
        int month = 12;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 1;
        int expectedYear = 2019;
        int resultDay = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expectedDay,resultDay);
        int resultMonth = NextDayCalculator.getMonth();
        assertEquals(expectedMonth, resultMonth);
        int resultYear = NextDayCalculator.getYear();
        assertEquals(expectedYear,resultYear);
    }

    @Test
    void nextDayCalculatorTest6(){
        int day =29;
        int month = 2;
        int year = 2020;
        int expectedDay = 1;
        int expectedMonth = 3;
        int expectedYear = 2020;
        int resultDay = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expectedDay,resultDay);
        int resultMonth = NextDayCalculator.getMonth();
        assertEquals(expectedMonth, resultMonth);
        int resultYear = NextDayCalculator.getYear();
        assertEquals(expectedYear,resultYear);
    }
}