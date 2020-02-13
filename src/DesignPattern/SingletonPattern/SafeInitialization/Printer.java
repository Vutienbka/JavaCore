package DesignPattern.SingletonPattern.SafeInitialization;
// Ap dung tot cho da luong

public class Printer {
    private static Printer instance;
    private boolean isConnected = false;

    private Printer(){}

    public static synchronized Printer getInstance(){
        if(instance == null)
            instance = new Printer();
        return instance;
    }

    public void connectToPrinter(boolean connectStatus){
        this.isConnected = connectStatus;
        if(isConnected)
            System.out.println("Connected to printer");
        else System.out.println("Not to connected to Printer");
    }
}
