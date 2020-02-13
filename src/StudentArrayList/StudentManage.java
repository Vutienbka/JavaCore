package StudentArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManage{
    char dashSymbol = '-';
    final int QUANTITY_DASH_SYMBOL =70;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<Student>();

    public void addList(Student student) {
        studentList.add(student);
    }
    public void initialFirstStudent(){
        Student std1 = new Student("HV01", "NGUYEN THANH NAM","02/08/2000","Male","Ha Noi");
        addList(std1);
        Student std2 = new Student("HV02", "NGUYEN PHUONG NAM", "02/08/2002", "Male", "Da Nang");
        addList(std2);
        Student std3 = new Student("HV03", "PHAM GIA BAO", "01/01/1992", "Male", "Nam Dinh");
        addList(std3);
        Student std4 = new Student("HV04", "PHAM PHUONG LINH", "12/12/1993", "Female", "Ha Giang");
        addList(std4);
        Student std5 = new Student("HV05", "NGUYEN THI PHUONG THAO", "12/06/1998", "Female", "Ninh Binh");
        addList(std5);
    }
    public void addOtherStudent(){
        int inputNumber = 1;
        while(inputNumber!=0){
            Student student = new Student();
            System.out.println("Input Id: ");
            student.setId(scanner.nextLine());
            Iterator<Student> studentIterator = studentList.iterator();
            while(studentIterator.hasNext()) {
                if (student.getId().equals(studentIterator.next().getId())) {
                    System.out.println("Existed id -->Input again");
                    return;
                }
            }
            System.out.println("Input name: ");
            student.setName(scanner.nextLine());
            System.out.println("Input date of birth: ");
            student.setDateOfBirth(scanner.nextLine());
            System.out.println("Input gender: ");
            student.setGender(scanner.nextLine());
            System.out.println("Input place of birth: ");
            student.setPlaceOfBirth(scanner.nextLine());
            addList(student);
            System.out.println("Student added");

            System.out.println("Do you want to add more (YES!0 / NO=0)???");
            inputNumber = ((scanner.nextInt() == 0) ? 0 : 1);
            scanner.nextLine();
        }
    }

    public void sortListByName(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }
        });
        System.out.println("List is sorted");
    }
    public void sortListById(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getId().compareTo(student2.getId());
            }
        });
        System.out.println("List is sorted");
    }
    public void findById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Student's Id:");
        String studentId = scanner.nextLine();
        Iterator<Student> studentIterator = studentList.iterator();
        while (studentIterator.hasNext()) {
            Student currentStudent = studentIterator.next();
            if(studentId.equals(currentStudent.getId())) {
                System.out.println("Found student:");
                currentStudent.displayMainInfo();
                break;
            }
            if(!studentIterator.hasNext()) {
                System.out.println("Invalid Student");
                break;
            }
        }
    }
    public boolean findByName(){
        final int FIND_BY_FIRST_NAME =1;
        final int FIND_BY_LAST_NAME =2;
        final int FIND_BY_FULL_NAME =3;

        System.out.println("Choose type of finding method:");
        for(int i = 1; i<=QUANTITY_DASH_SYMBOL;i++)
            System.out.printf("%c", dashSymbol);

        System.out.println("\nFind by first name: Input 1");
        System.out.println("Find by last name: Input 2");
        System.out.println("Find by full name: Input 3");
        for(int i = 1; i<=QUANTITY_DASH_SYMBOL;i++)
            System.out.printf("%c", dashSymbol);
        System.out.println("\nInput:");
        int inputNumber = scanner.nextInt();
        scanner.nextLine();
        switch (inputNumber) {
            case FIND_BY_FIRST_NAME:
            case FIND_BY_LAST_NAME: {
                int count = 0;
                System.out.println("Input Student's Name:");
                String studentName = scanner.nextLine();
                Iterator<Student> studentIterator = studentList.iterator();
                ArrayList<Student> foundStudentList = new ArrayList<>();
                while (studentIterator.hasNext()) {
                    Student currentStudent = studentIterator.next();
                    if (currentStudent.getName().contains(studentName)) {
                        count++;
                        foundStudentList.add(currentStudent);
                    }
                    if (!studentIterator.hasNext() && count == 0) {
                        System.out.println("Student not found");
                        return false;
                    }
                }
                if(count !=0) {
                    System.out.println("Found student:");
                    for(Student student : foundStudentList) {
                        student.displayMainInfo();
                    }
                }
                return true;
            }
            case FIND_BY_FULL_NAME:{
                int count = 0;
                scanner.nextLine();
                System.out.println("Input Student's Name:");
                String studentName = scanner.nextLine();
                Iterator<Student> studentIterator = studentList.iterator();
                ArrayList<Student> foundStudentList = new ArrayList<>();
                while (studentIterator.hasNext()) {
                    Student currentStudent = studentIterator.next();
                    if (studentName.equals(currentStudent.getName())) {
                        foundStudentList.add(currentStudent);
                        count++;
                    }
                    if (!studentIterator.hasNext() && count == 0) {
                        System.out.println("Invalid Student");
                        return false;
                    }
                }
                if(count !=0) {
                    System.out.println("Found student:");
                    for(Student student : foundStudentList) {
                        student.displayMainInfo();
                    }
                }
                return true;
            }
            default:
                System.out.println("Invalid input");
                return false;
        }
    }
    public boolean deleteStudent(){
        final int DELETE_BY_ID = 1;
        final int DELETE_BY_FULL_NAME = 2;
        System.out.println("Choose type of delete method:");
        for(int i = 1; i<=QUANTITY_DASH_SYMBOL;i++)
            System.out.printf("%c", dashSymbol);

        System.out.println("\nDelete by Id: Input 1");
        System.out.println("Delete by name: Input 2");

        for(int i = 1; i<=QUANTITY_DASH_SYMBOL;i++)
            System.out.printf("%c", dashSymbol);
        System.out.println("\nInput:");
        int inputNumber = scanner.nextInt();
        scanner.nextLine();
        switch (inputNumber) {
            case DELETE_BY_ID: {
                int count = 0;
                System.out.println("\nInput Student's Id:");
                String studentId = scanner.nextLine();
                Iterator<Student> studentIterator = studentList.iterator();
                while (studentIterator.hasNext()) {
                    Student currentStudent = studentIterator.next();
                    if (studentId.equals(currentStudent.getId())) {
                        studentList.remove(currentStudent);
                        System.out.println("Deleted student:");
                        count++;
                        return true;
                    }
                    if (!studentIterator.hasNext() && count == 0) {
                        System.out.println("Invalid Student");
                        return false;
                    }
                }
            }

            case DELETE_BY_FULL_NAME:{
                int count = 0;
                scanner.nextLine();
                System.out.println("Input Student's Name:");
                String studentName = scanner.nextLine();
                Iterator<Student> studentIterator = studentList.iterator();
                while (studentIterator.hasNext()) {
                    Student currentStudent = studentIterator.next();
                    if (studentName.equals(currentStudent.getName())) {
                        System.out.println("Deleted student:");
                        studentList.remove(currentStudent);
                        count++;
                        return true;
                    }
                    if (!studentIterator.hasNext() && count == 0) {
                        System.out.println("Invalid Student");
                        return false;
                    }
                }
            }
            default:
                System.out.println("Invalid input");
                return false;
        }

    }
    public void repairInfo(){
        int input =1;
        final int REPAIR_ID =1;
        final int REPAIR_NAME =2;
        final int REPAIR_DATE_OF_BIRTH = 3;
        final int REPAIR_GENDER =4;
        final int REPAIR_PLACE_OF_BIRTH =5;

        while (input!=0) {
            System.out.println("What type of item do you want to repair ???");
            for(int i = 1; i<=QUANTITY_DASH_SYMBOL;i++)
                System.out.printf("%c", dashSymbol);
            System.out.println("\nRepair Id          : Input 1");
            System.out.println("Repair Name          : Input 2");
            System.out.println("Repair date of birth : Input 3");
            System.out.println("Repair gender        : Input 4");
            System.out.println("Repair place of birth: Input 5");
            for(int i = 1; i<=QUANTITY_DASH_SYMBOL;i++)
                System.out.printf("%c", dashSymbol);
            System.out.println("\nInput: ");
            int inputNumber = scanner.nextInt();
            scanner.nextLine();
            switch (inputNumber) {
                case REPAIR_ID: {
                    System.out.println("Input student's Id");
                    String inputId = scanner.nextLine();
                    Student currentStudent = new Student();
                    for (Student student : studentList) {
                        if (inputId.equals(student.getId())) {
                            System.out.println("Found student");
                            currentStudent = student;
                            currentStudent.displayMainInfo();
                            break;
                        }
                    }
                    if (currentStudent.getId() == null) {
                        System.out.println("Student not found");
                        break;
                    }

                    boolean flag = true;
                    String newId ="";
                    while (flag) {
                        System.out.println("Input new Id:");
                        newId = scanner.nextLine();
                        for (Student student : studentList)
                            if (newId.equals(student.getId())) {
                                System.out.println("Existed Id --> Input another Id");
                                return;
                            }
                        System.out.println("Do you want to change Id again??  if YES Input !=0 number else Input ==0 number");
                        flag = (scanner.nextInt()!=0) ? true : false;
                        scanner.nextLine();
                        break;

                    }
                    System.out.println("New Id is valid");
                    currentStudent.setId(newId);
                    System.out.println("Id is updated");
                    currentStudent.displayMainInfo();
                    break;
                }

                case REPAIR_NAME: {
                    System.out.println("Input student's Id:");
                    String inputId = scanner.nextLine();
                    Student currentStudent = new Student();
                    for (Student student : studentList) {
                        if (inputId.equals(student.getId())) {
                            System.out.println("Found student");
                            currentStudent = student;
                            currentStudent.displayMainInfo();
                            break;
                        }
                    }
                    if (currentStudent.getId() == null) {
                        System.out.println("Student not found");
                        break;
                    }

                    boolean flag = true;
                    String newName ="";
                    while (flag) {
                        System.out.println("Input new Name:");
                        newName = scanner.nextLine();
                        for (Student student : studentList) {
                            if (newName.equals(student.getName())) {
                                System.out.println("Existed Name");
                                System.out.println("Do you want to continue??  if YES Input !=0 number else Input ==0 number");
                                flag = (scanner.nextInt()!=0) ? true : false;
                                scanner.nextLine();
                                break;
                            }
                            else flag = false;
                        }
                    }
                    currentStudent.setName(newName);
                    System.out.println("Name is updated");
                    currentStudent.displayMainInfo();
                    break;
                }
                case REPAIR_DATE_OF_BIRTH:{
                    System.out.println("Input student's Id:");
                    String inputId = scanner.nextLine();
                    Student currentStudent = new Student();
                    for (Student student : studentList) {
                        if (inputId.equals(student.getId())) {
                            System.out.println("Found student");
                            currentStudent = student;
                            currentStudent.displayMainInfo();
                            break;
                        }
                    }
                    if (currentStudent.getId() == null) {
                        System.out.println("Student not found");
                        break;
                    }

                    boolean flag = true;
                    String newDateOfBirth ="";
                    while (flag) {
                        System.out.println("Input new date of birth:");
                        newDateOfBirth = scanner.nextLine();
                        for (Student student : studentList) {
                            if (newDateOfBirth.equals(student.getDateOfBirth())) {
                                System.out.println("Existed date of birth");
                                System.out.println("Do you want to continue??  if YES Input !=0 number else Input ==0 number");
                                flag = (scanner.nextInt()!=0) ? true : false;
                                scanner.nextLine();
                                break;
                            }
                            else flag = false;
                        }
                    }
                    currentStudent.setDateOfBirth(newDateOfBirth);
                    System.out.println("Date of birth is updated");
                    currentStudent.displayMainInfo();
                    break;
                }
                case REPAIR_GENDER:{
                    System.out.println("Input student's Id:");
                    String inputId = scanner.nextLine();
                    Student currentStudent = new Student();
                    for (Student student : studentList) {
                        if (inputId.equals(student.getId())) {
                            System.out.println("Found student");
                            currentStudent = student;
                            currentStudent.displayMainInfo();
                            break;
                        }
                    }
                    if (currentStudent.getId() == null) {
                        System.out.println("Student not found");
                        break;
                    }

                    boolean flag = true;
                    String newGender="";
                    while (flag) {
                        System.out.println("Input new date of birth:");
                        newGender = scanner.nextLine();
                        for (Student student : studentList) {
                            if (newGender.equals(student.getGender())) {
                                System.out.println("Do you want to continue??  if YES Input !=0 number else Input ==0 number");
                                flag = (scanner.nextInt()!=0) ? true : false;
                                scanner.nextLine();
                                break;
                            }
                            else flag = false;
                        }
                    }
                    currentStudent.setGender(newGender);
                    System.out.println("Gender is updated");
                    currentStudent.displayMainInfo();
                    break;
                }
                case REPAIR_PLACE_OF_BIRTH:{

                    System.out.println("Input student's Id:");
                    String inputId = scanner.nextLine();
                    Student currentStudent = new Student();
                    for (Student student : studentList) {
                        if (inputId.equals(student.getId())) {
                            System.out.println("found student");
                            currentStudent = student;
                            currentStudent.displayMainInfo();
                            break;
                        }
                    }
                    if (currentStudent.getId() == null) {
                        System.out.println("Student not found");
                        break;
                    }

                    boolean flag = true;
                    String newPlaceOfBirth="";
                    while (flag) {
                        System.out.println("Input new date of birth:");
                        newPlaceOfBirth = scanner.nextLine();
                        for (Student student : studentList) {
                            if (newPlaceOfBirth.equals(student.getDateOfBirth())) {
                                System.out.println("Do you want to continue??  if YES Input !=0 number else Input ==0 number");
                                flag = (scanner.nextInt()!=0) ? true : false;
                                scanner.nextLine();
                                break;
                            }
                            else flag = false;
                        }
                    }
                    currentStudent.setGender(newPlaceOfBirth);
                    System.out.println("Place of birth is updated");
                    currentStudent.displayMainInfo();
                    break;
                }
            }
            System.out.println("Do you want to continue changing other items ??? (YES!0 / NO=0)???");
            input= ((scanner.nextInt()==0) ? 0 : 1);
            scanner.nextLine();
        }
    }
    public void showInfo() {
        // for (Student student : studentList) student.display();
        int input = 1;
        Iterator<Student> studentIterator = studentList.iterator();
        while (studentIterator.hasNext()) {
            Student currentStudent = studentIterator.next();
            currentStudent.displayMainInfo();
        }
    }

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
        String input1 ="Input 1";
        String input2 ="Input 2";
        String input3 ="Input 3";
        String input4 ="Input 4";
        String input5 ="Input 5";
        String input6 ="Input 6";
        String input7 ="Input 7";
        String input8 ="Input 8";
        String input9 ="Input 9";
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
            System.out.printf("\nRepair info of student: %11s%35c\n",input9,daggerSymbol);
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
            }
        }
        //System.out.println(studentManage.ageCalculator(studentManage.studentList.get(1)));
    }
}
