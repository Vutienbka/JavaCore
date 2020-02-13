package DesignPattern.SingletonPattern.SafeInitialization;

public class Employee {
    public static void main(String[] args) {
        Printer testPrinter = Printer.getInstance();
        testPrinter.connectToPrinter(true);
    }

}
