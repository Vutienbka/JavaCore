package DesignPattern.SingletonPattern.DoubleCheckLockingSingleton;

// Ap dung tot cho da luong
//Hieu suat cao hon safe

public class Printer {
    private static Printer instance;
    private boolean isConnected = false;

    private Printer(){}

    public static synchronized Printer getInstance(){
        if(instance == null)
            try{
                if(instance == null)
                    instance = new Printer();
            }catch (Exception e){
                throw new RuntimeException("cannot create object");
            }
        return instance;
    }

    public void connectToPrinter(boolean connectStatus){
        this.isConnected = connectStatus;
        if(isConnected)
            System.out.println("Connected to printer");
        else System.out.println("Not to connected to Printer");
    }

}
