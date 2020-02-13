package MultiThread_JoinThread;

public class JoinThread extends Thread{
    private String threadName;

    public JoinThread() {
    }

    public JoinThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(threadName + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
