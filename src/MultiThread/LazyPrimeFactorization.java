package MultiThread;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for(int i = 2; i < 100; i++){
            if(isPrimeNumber(i))
                System.out.println(Thread.currentThread().getName()+" " + i);
        }
    }
    public boolean isPrimeNumber(int n){
        if(n == 2)
            return true;
        if(n > 2){
            for(int i = 2; i < n; i++){
                if(n%i == 0)
                    return false;
            }
        }
        return true;
    }
}
