package FatorialCalculatorUsingRecursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
    @Test
    void testFactorialCalculator1(){
        int number =5;
        int expectedResult = 120;
        int actualResult = FactorialCalculator.factorialCalculator(number);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void testFactorialCalculator2(){
        int number =0;
        int expectedResult = 1;
        int actualResult = FactorialCalculator.factorialCalculator(number);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void testFactorialCalculator3(){
        int number =-1;
        int actualResult = FactorialCalculator.factorialCalculator(number);
    }

}