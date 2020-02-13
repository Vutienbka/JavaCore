package FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzCalculatorTest {
    @Test
    void testFizzBuzz1()
    {
        int number = 3;
        String expectedResult = "Fizz";
        String actualResult = FizzBuzzCalculator.fizzBuzzCalculator(number);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testFizzBuz2()
    {
        int number = 5;
        String expectedResult = "Buzz";
        String actualResult = FizzBuzzCalculator.fizzBuzzCalculator(number);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void testFizzBuz3()
    {
        int number = 15;
        String expectedResult = "FizzBuzz";
        String actualResult = FizzBuzzCalculator.fizzBuzzCalculator(number);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void testFizzBuz4()
    {
        int number = 7;
        String expectedResult = "seven";
        String actualResult = FizzBuzzCalculator.fizzBuzzCalculator(number);
        assertEquals(expectedResult,actualResult);
        System.out.println(actualResult);
    }

}