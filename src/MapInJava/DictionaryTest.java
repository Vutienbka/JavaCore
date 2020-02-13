package MapInJava;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DictionaryManage dictionaryTest = new DictionaryManage();
        int input =1;
        final int ADD_FIRST_DATA = 1;
        final int SHOW_MAP = 2;
        final int FIND_WORD = 3;
        final int REMOVE_MAP = 4;
        final int SORT_MAP = 5;
        final int QUANTITY_DASH_SYMBOL = 60;
        char dashSymbol = '-';
        while (input!=0) {
            System.out.println("Choose one of item");
            for(int i = 1; i<=QUANTITY_DASH_SYMBOL;i++)
                System.out.printf("%c", dashSymbol);
            System.out.println();
            System.out.println("Add first data    : Input 1");
            System.out.println("Show map          : Input 2");
            System.out.println("Find word         : Input 3");
            System.out.println("Remove map        : Input 4");
            System.out.println("Sort map          : Input 5");
            for(int i = 1; i<=QUANTITY_DASH_SYMBOL;i++)
                System.out.printf("%c", dashSymbol);

            System.out.println("\nInput number: ");
           int inputNumber = scanner.nextInt();
            scanner.nextLine();
            switch (inputNumber) {
                case ADD_FIRST_DATA:
                    dictionaryTest.addFirstData();
                    System.out.println("\nCONTINUE ?? YES input !0 number NO input 0");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case SHOW_MAP:
                    System.out.println("---------------------------------------------");
                    dictionaryTest.showMap();
                    System.out.println("\nCONTINUE ?? YES input !0 number NO input 0");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case FIND_WORD:
                    dictionaryTest.findWord();
                    System.out.println("\nCONTINUE ?? YES input !0 number NO input 0");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case REMOVE_MAP:
                    dictionaryTest.removeAllMap();
                    System.out.println("\nCONTINUE ?? YES input !0 number NO input 0");
                    input = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case SORT_MAP:
                    dictionaryTest.sortMap();
                    System.out.println("\nCONTINUE ?? YES input !0 number NO input 0");
                    input= scanner.nextInt();
                    scanner.nextLine();
                    break;
            }
        }

    }
}
