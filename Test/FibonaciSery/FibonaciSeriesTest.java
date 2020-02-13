package FibonaciSery;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {
    @Test
    void testFibonacci1() {
        int expectedQuantityOfFibonacciNumber = 13;
        int[] expectedFibonacciArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int[] actualFibonacciArray = FibonaciSeries.displayFibonacciSeries(expectedQuantityOfFibonacciNumber);
        for(int i=0; i<expectedQuantityOfFibonacciNumber; i++)
        assertEquals(expectedFibonacciArray[i],actualFibonacciArray[i]);
    }
    @Test
    void testFibonacci2() {
        int expectedQuantityOfFibonacciNumber = 10;
        int[] expectedFibonacciArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] actualFibonacciArray = FibonaciSeries.displayFibonacciSeries(expectedQuantityOfFibonacciNumber);
        for(int i=0; i<expectedFibonacciArray.length; i++)
            assertEquals(expectedFibonacciArray[i],actualFibonacciArray[i]);
    }
    @Test
    void testFibonacci3() {
        int expectedQuantityOfFibonacciNumber = 3;
        int[] expectedFibonacciArray = {0, 1, 1};
        int[] actualFibonacciArray = FibonaciSeries.displayFibonacciSeries(expectedQuantityOfFibonacciNumber);
        for(int i=0; i<expectedFibonacciArray.length; i++)
            assertEquals(expectedFibonacciArray[i],actualFibonacciArray[i]);
    }
    @Test
    void testFibonacci4() {
        int expectedQuantityOfFibonacciNumber = 2;
        int[] expectedFibonacciArray = {0, 1};
        int[] actualFibonacciArray = FibonaciSeries.displayFibonacciSeries(expectedQuantityOfFibonacciNumber);
        for(int i=0; i<expectedFibonacciArray.length; i++)
            assertEquals(expectedFibonacciArray[i],actualFibonacciArray[i]);
    }
    @Test
    void testFibonacci5() {
        int expectedQuantityOfFibonacciNumber = 1;
        int[] expectedFibonacciArray = {0};
        int[] actualFibonacciArray = FibonaciSeries.displayFibonacciSeries(expectedQuantityOfFibonacciNumber);
        for(int i=0; i<expectedFibonacciArray.length; i++)
            assertEquals(expectedFibonacciArray[i],actualFibonacciArray[i]);
    }


}