package QueueStack;

import java.util.*;

public class StudentTest {
    LinkedList<Student> studentList = new LinkedList<>();
    public void addList(Student student) {
        studentList.add(student);
    }
    public void initialFirstStudent(){
        Student std1 = new Student("HV01", "NGUYEN THANH NAM","02/08/2000","Male");
        addList(std1);
        Student std2 = new Student("HV02", "NGUYEN PHUONG NAM", "02/08/2002", "Female");
        addList(std2);
        Student std3 = new Student("HV03", "PHAM GIA BAO", "01/01/1992", "Male");
        addList(std3);
        Student std4 = new Student("HV04", "PHAM PHUONG LINH", "12/12/1993", "Female");
        addList(std4);
        Student std5 = new Student("HV05", "NGUYEN THI PHUONG THAO", "12/06/1998", "Male");
        addList(std5);
    }

    public void addToStudentQueue(){
        Queue<Student> queue = new LinkedList<>();
        String male = "Male";
        String female = "Female";
        Iterator<Student> studentIterator = studentList.iterator();
        while (studentIterator.hasNext()) {
            Student currentStudent = studentIterator.next();
            currentStudent.displayMainInfo();
        }
        System.out.println("-----------------------------------------------------------------------");
        studentIterator = studentList.iterator();
        while (studentIterator.hasNext()) {
            Student currentStudent = studentIterator.next();
            if (currentStudent.getGender().equals(male)) {
                queue.add(currentStudent);
            }
        }
        studentIterator = studentList.iterator();
        while (studentIterator.hasNext()) {
            Student currentStudent = studentIterator.next();
            if (currentStudent.getGender().equals(female)) {
                queue.add(currentStudent);
            }
        }
//        while (!queue.isEmpty()) {
//            queue.poll().displayMainInfo();
//        }
        while (!queue.isEmpty()) {
            queue.poll().displayMainInfo();
       }
    }

    public static void main(String[] args) {

        StudentTest studentTest = new StudentTest();
        studentTest.initialFirstStudent();
        studentTest.addToStudentQueue();
    }
}