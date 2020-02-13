package FinalTest;

import java.util.ArrayList;
import java.util.Scanner;

public class TestContact {
    public static void main(String[] args) {
        ContactManage contactManage = new ContactManage();
        ArrayList<Contact> contactList = new ArrayList<>();
        char dashSymbol = '-';
        char daggerSymbol = '|';
        final int QUANTITY_DASH_SYMBOL =70;
        final int INITIAL_FIRST_CONTACT_LIST = 1;
        final int SHOW_CONTACT = 2;
        final int ADD_NEW_CONTACT = 3;
        final int UPDATE = 4;
        final int DELETE_CONTACT = 5;
        final int SEARCH_CONTACT= 6;
        final int READ_FILE = 7;
        final int WRITE_FILE = 8;
        String input1 ="Input 1";
        String input2 ="Input 2";
        String input3 ="Input 3";
        String input4 ="Input 4";
        String input5 ="Input 5";
        String input6 ="Input 6";
        String input7 ="Input 7";
        String input8 ="Input 8";

        Scanner scanner = new Scanner(System.in);
        int inputNumber=1;
        while(inputNumber!=0) {
            System.out.println("Please choose one of items below by input number from keyboard:");
            System.out.println("At first please choose input 1:");
            System.out.printf("\nInitialize first Contact: input 1",input1);
            System.out.printf("\nShow contact: input 2",input2);
            System.out.printf("\nAdd New Contact: input 3",input3);//35
            System.out.printf("\nUpdate Contact: input 4",input4);
            System.out.printf("\nDelete Contact: input 5",input5);
            System.out.printf("\nSearch Contact: input 6",input6);
            System.out.printf("\nRead File: input 7",input7);
            System.out.printf("\nWrite File: input 8",input8);

            System.out.println("\nInput: ");
            inputNumber = scanner.nextInt();
            scanner.nextLine();
            switch (inputNumber) {
                case INITIAL_FIRST_CONTACT_LIST:
                    contactManage.initialFirstContact(contactList);
                    System.out.println("Contact list initialized");
                    System.out.println("Do you want to continue (YES!0 / NO=0)???)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case SHOW_CONTACT:
                    contactManage.showContact(contactList);
                    System.out.println("Show Contact:");
                    System.out.println("Do you want to continue (YES!0 / NO=0)???)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case ADD_NEW_CONTACT:
                    contactManage.addNewContact(contactList);
                    System.out.println("Add new Contact:");
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case UPDATE:
                    System.out.println("Update Contact:");
                    contactManage.updateContact(contactList);
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case DELETE_CONTACT:
                    contactManage.deleteContact(contactList);
                    System.out.println("Delete Contact:");
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case SEARCH_CONTACT:
                    System.out.println("Search Contact:");
                    contactManage.searchContact(contactList);
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case READ_FILE:

                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case WRITE_FILE:

                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
            }
        }
    }
}
