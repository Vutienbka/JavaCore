package MultiThread_Synchronize;

public class SynchronizeThread implements Runnable{
    private int sum;

    public SynchronizeThread() {
        this.sum = 1000;
    }

    public SynchronizeThread(int sum) {
        this.sum = sum;
    }

    public synchronized void withdrawMoney() throws InterruptedException {
        if(sum > 0) {
                Thread.sleep(1000);
            sum = sum - 1000;
            System.out.println(sum);
        }
        else System.out.println("run out of money");
    }
    @Override
    public void run() {
        try {
            withdrawMoney();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
