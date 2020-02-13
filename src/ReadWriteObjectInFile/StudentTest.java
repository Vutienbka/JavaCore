package ReadWriteObjectInFile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class StudentTest {
    public static void main(String[] args) {
        char dashSymbol = '-';
        char daggerSymbol = '|';
        final int QUANTITY_DASH_SYMBOL =70;
        final int INITIAL_FIRST_STUDENTS = 1;
        final int FIND_STUDENT_BY_ID = 2;
        final int FIND_STUDENT_BY_NAME = 3;
        final int SORT_LIST_BY_ID = 4;
        final int SORT_LIST_BY_NAME = 5;
        final int DELETE_STUDENT = 6;
        final int SHOW_INFO = 7;
        final int ADD_OTHER_STUDENT = 8;
        final int REPAIR_INFO = 9;
        final int WRITEFILE = 10;
        final int READFILE = 11;

        String input1 ="Input 1";
        String input2 ="Input 2";
        String input3 ="Input 3";
        String input4 ="Input 4";
        String input5 ="Input 5";
        String input6 ="Input 6";
        String input7 ="Input 7";
        String input8 ="Input 8";
        String input9 ="Input 9";
        String input10 ="Input 10";
        String input11 ="Input 11";
        Scanner scanner = new Scanner(System.in);
        StudentManage studentManage = new StudentManage();
        int inputNumber=1;
        while(inputNumber!=0) {
            System.out.println("Please choose one of items below by input number from keyboard:");
            System.out.println("At first please choose input 1:");
            for (int i = 1; i <= QUANTITY_DASH_SYMBOL; i++)
                System.out.printf("%c", dashSymbol);
            System.out.printf("\nAdd Initialized students: %9s%35c",input1,daggerSymbol);
            System.out.printf("\nFind student by Id: %15s%35c",input2,daggerSymbol);
            System.out.printf("\nFind student by Name: %13s%35c",input3,daggerSymbol);//35
            System.out.printf("\nSort list by Id: %18s%35c",input4,daggerSymbol);
            System.out.printf("\nSort list by name: %16s%35c",input5,daggerSymbol);
            System.out.printf("\nDelete student: %19s%35c",input6,daggerSymbol);
            System.out.printf("\nShow info of student: %13s%35c",input7,daggerSymbol);
            System.out.printf("\nAdd other student: %16s%35c",input8,daggerSymbol);
            System.out.printf("\nRepair info of student: %11s%35c",input9,daggerSymbol);
            System.out.printf("\nWrite in file: %21s%34c",input10,daggerSymbol);
            System.out.printf("\nRead from file: %20s%34c\n",input11,daggerSymbol);
            for (int i = 1; i <= QUANTITY_DASH_SYMBOL; i++)
                System.out.printf("%c", dashSymbol);
            System.out.println("\nInput: ");
            inputNumber = scanner.nextInt();
            scanner.nextLine();
            switch (inputNumber) {
                case INITIAL_FIRST_STUDENTS:
                    studentManage.initialFirstStudent();
                    System.out.println("Student list initialized");
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case FIND_STUDENT_BY_ID:
                    studentManage.findById();
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case FIND_STUDENT_BY_NAME:
                    studentManage.findByName();
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case SORT_LIST_BY_ID:
                    studentManage.sortListById();
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case SORT_LIST_BY_NAME:
                    studentManage.sortListByName();
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case DELETE_STUDENT:
                    studentManage.deleteStudent();
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case SHOW_INFO:
                    studentManage.showInfo();
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case ADD_OTHER_STUDENT:
                    studentManage.addOtherStudent();
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case REPAIR_INFO:
                    studentManage.repairInfo();
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case WRITEFILE:
                    studentManage.writeFile(studentManage.studentList);
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
                case READFILE:
                    ArrayList studentList = studentManage.readFile();
                    Iterator<Student> studentIterator = studentList.iterator();
                    while (studentIterator.hasNext()) {
                        Student currentStudent = studentIterator.next();
                        currentStudent.displayMainInfo();
                    }
                    System.out.println("Do you want to continue (YES!0 / NO=0)???");
                    inputNumber= ((scanner.nextInt()==0) ? 0 : 1);
                    scanner.nextLine();
                    break;
            }
        }
        //System.out.println(studentManage.ageCalculator(studentManage.studentList.get(1)));
    }
}