package FatorialCalculatorUsingRecursion;

import javax.naming.AuthenticationNotSupportedException;

public class FactorialCalculator {
    public static int factorialCalculator(int number)
    {
        final int UNEXPECTED_NUMBER = -1;
        if(number >= 0) {
            if (number == 0 || number == 1)
                return 1;
            else return number * factorialCalculator(number - 1);
        }
        else
            throw new UnsupportedOperationException();
    }
}
