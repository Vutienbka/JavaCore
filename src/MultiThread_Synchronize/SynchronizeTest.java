package MultiThread_Synchronize;

public class SynchronizeTest {
    public static void main(String[] args) {
        SynchronizeThread t = new SynchronizeThread();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        // Neu t1 truy xuat vao ham withdrawMoney truoc thi no se chiem giu ham nay va no khoa lai
        // thread t2 muon truy xuat ham nay thi phai doi
        t1.start();
        t2.start();
    }
}
