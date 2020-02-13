package DesignPattern.SingletonPattern.StaticBlockInitialization;

public class Employee {
    public static void main(String[] args) {
        Printer testPrinter1 = Printer.getInstance();
        testPrinter1.connectToPrinter(true);
    }
}
