package FibonaciSery;

public class FibonaciSeries {

    public static int findFibonacciNumber(int NthFibonacciNumber) {
        if (NthFibonacciNumber == 0)
            return 0;
        else if (NthFibonacciNumber == 1)
            return 1;
        else return findFibonacciNumber(NthFibonacciNumber - 1) + findFibonacciNumber(NthFibonacciNumber - 2);
    }

    public static int[] displayFibonacciSeries(int quantityOfNumber) {
        int[] fibonacciNumberArray = new int[quantityOfNumber];
        for (int i = 0; i < quantityOfNumber; i++)
            fibonacciNumberArray[i] = findFibonacciNumber(i);
        return fibonacciNumberArray;
    }
}