package MultiThread;

public class NumberTestThread {
    public static void main(String[] args) {
        Thread t1 = new OddThread();
        Thread t2 = new EvenThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }

}
