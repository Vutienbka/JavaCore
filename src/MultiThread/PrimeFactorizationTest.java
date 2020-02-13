package MultiThread;

public class PrimeFactorizationTest {
    public static void main(String[] args) {
        LazyPrimeFactorization prime1 = new LazyPrimeFactorization();
        OptimizePrimeFactorization prime2 = new OptimizePrimeFactorization();
        Thread t1 = new Thread(prime1);
        Thread t2 = new Thread(prime2);
        t1.start();
        t2.start();
    }
}
