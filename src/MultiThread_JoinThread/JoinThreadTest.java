package MultiThread_JoinThread;

public class JoinThreadTest {
    public static void main(String[] args) {
        JoinThread t1 = new JoinThread("A");
        JoinThread t2 = new JoinThread("B");
        t1.start();
        try {
            //t1.join();// Khi thread t1 chay xong thi thread t2 moi duoc chay
            t1.join(1500); // khi thread t1 chay dc 1500 ms thi thread t1 va t2 chay dong thoi
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
