package MultiThread;

public class NumberGenerator implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i <10; i++)
            System.out.println(Thread.currentThread().getName() + " " + i);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator();
        NumberGenerator num2 = new NumberGenerator();
        Thread t1 = new Thread(num1);
        Thread t2 = new Thread(num2);
        //t1.setPriority(Thread.MAX_PRIORITY);
        //t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
