package DesignPattern.SingletonPattern.LazyPattern;

//Dam bao bien chi dc khoi tao trong class --> private static variable
// Han che truy cap tu ben ngoai: --> private constructor
// Co mot public static de return instance o tren

    public class Printer {
        private static Printer instance;
        private boolean isConnected = false;
        private Printer(){
        }

        public static Printer getInstance(){
            if(instance==null)
                instance = new Printer();
            return instance;
        }

        public void connectToPrinter(boolean connectStatus){
            isConnected = connectStatus;
            if(isConnected)
                System.out.println("Connected to printer");
            else
                System.out.println("Not connected to Printer");
        }

    }

