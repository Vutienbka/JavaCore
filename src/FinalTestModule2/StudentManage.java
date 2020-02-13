package FinalTestModule2;

import CaseStudy_EnglishVietNameseDictionary.RegexExpression;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;

public class StudentManage{
    FileIO file;
    public void display(ChooseDisplayType select,ArrayList<Student> studentList){
        //ArrayList<Student> students = AddList();
        String id = "ID";
        String name = "NAME";
        String gmail = "GMAIL";
        String grade = "GRADE";
        Scanner scanner = new Scanner(System.in);
        switch (select){
            case GRADE_GREATER_THAN_85:
                ArrayList<Student> studentList1 = filterGrade(studentList,85);
                System.out.println("List of student has grate greater than 85: ");
                System.out.printf("%-20s%-20s%-30s%-10s\n",id,name,gmail,grade);
                for(Student student : studentList1) {
                    System.out.printf("%-20s%-20s%-30s%-10s\n", student.getId(), student.getName(), student.getEmail(), student.getGrade().toString());
                }
                break;
            case GRADE_DESCENDING:
                ArrayList<Student> studentList2 = sortGradeDescending(studentList);
                System.out.println("List of student has grate descending ");
                System.out.printf("%-20s%-20s%-30s%-10s\n",id,name,gmail,grade);
                for(Student student : studentList2)
                    System.out.printf("%-20s%-20s%-30s%-10s\n",student.getId(),student.getName(),student.getEmail(), student.getGrade().toString());
                break;
            case SORT_NAME_GRADE: // sap xep theo "ten" tang dan neu ten trung nhau thi sap xep theo diem
                ArrayList<Student> studentList3 = sortNameAscending(studentList);
                System.out.println("List of student has name ascending ");
                System.out.printf("%-20s%-20s%-30s%-10s\n",id,name,gmail,grade);
                for(Student student : studentList3)
                    System.out.printf("%-20s%-20s%-30s%-10s\n",student.getId(),student.getName(),student.getEmail(), student.getGrade().toString());
                break;
            case SORT_LASTNAME_FIRSTNAME: // sap xep theo "ten ho" tang dang neu trung nhau thi sap xep theo "ten"
            {
                ArrayList<Student> studentList4;
                System.out.println("List of student has name ascending ");
                studentList4 = sortAscendingByName(studentList);
                for (Student student1 : studentList4) {
                    System.out.printf("%-20s%-20s%-30s%-10s\n", student1.getId(), student1.getName(), student1.getEmail(), student1.getGrade().toString());
                }
                break;
            }
            case BY_SELECTED_ID: {
                System.out.println("Display student with ID is:");
                System.out.println("Input Id: ");
                String ID = scanner.nextLine();
                Student student = findStudentById(studentList, ID);
                if (student != null) {
                    System.out.printf("%-20s%-20s%-30s%-10s\n", id, name, gmail, grade);
                    System.out.printf("%-20s%-20s%-30s%-10s\n", student.getId(), student.getName(), student.getEmail(), student.getGrade().toString());
                    break;
                } else {
                    System.out.println("Student not found");
                    break;
                }
            }
            case FIND_BY_LASTNAME:
                System.out.println("Display student  list with the same last name of:");
                System.out.println("Input last name: ");
                String lastName = scanner.nextLine();
                ArrayList<Student> studentWithTheSameLastNameList = findByLastName(studentList,lastName);
                for(Student student : studentWithTheSameLastNameList)
                    System.out.printf("%-20s%-20s%-30s%-10s\n",student.getId(),student.getName(),student.getEmail(), student.getGrade().toString());
                break;
        }
    }

    public ArrayList<Student> filterGrade(ArrayList<Student> students, int grade){
        ArrayList<Student> gradeGreaterThan85Student = new ArrayList<>();
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()){
            Student currentStudent = studentIterator.next();
            if(currentStudent.getGrade() > 85)
                gradeGreaterThan85Student.add(currentStudent);
        }
        return gradeGreaterThan85Student;
    }
    public ArrayList<Student> sortGradeDescending(ArrayList<Student> students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return -student1.getGrade().compareTo(student2.getGrade());
            }
        });
        return students;
    }
    //Sap xep tang dan theo ten ho neu trung "ten ho" thi sap xep theo "ten"
    public ArrayList<Student> sortAscendingByName(ArrayList<Student> students){
        RegexExpression regexExpression = new RegexExpression("^(\\p{L}+)\\s(.+)\\s(.+)$");
        String regex = regexExpression.getRegex();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                Matcher matcher1 = regexExpression.getMatcher(regex,student1.getName());
                String studentLastName1 = null;
                String studentFirstName1 = null;
                while (matcher1.find()){
                    studentLastName1 = matcher1.group(1);
                    studentFirstName1 = matcher1.group(3);
                }
                Matcher matcher2 = regexExpression.getMatcher(regex,student2.getName());
                String studentLastName2 = null;
                String studentFirstName2 = null;
                while (matcher2.find()){
                    studentLastName2 = matcher2.group(1);
                    studentFirstName2 = matcher2.group(3);
                }
                int name = studentLastName1.compareTo(studentLastName2);
                if (name == 0) {
                    int name1 = studentFirstName1.compareTo(studentFirstName2);
                    return name1;
                }
                return name;
            }
        });
        return students;
    }
    // Sap xep theo thu tu ten ho tang theo "ten" neu trung "ten" thi sap xep tang dan theo "diem"
    public ArrayList<Student> sortNameAscending(ArrayList<Student> students){
//        RegexExpression regexExpression = new RegexExpression("^(\\w+)\\s(.+)\\s(.+)$");
//        String regex = regexExpression.getRegex();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                int name = student1.getName().compareTo(student2.getName());
                if (name == 0) {
                    int i = student1.getGrade() > student2.getGrade() ? 1 : student1.getGrade() < student2.getGrade() ? -1 : 0;
                    return i;
                }
                return name;
            }
        });
        return students;
    }
    public ArrayList<Student> AddList(){
        ArrayList<Student> students = new ArrayList<>();
        file = new FileIO();
        String fileContent = file.readFile();
        RegexExpression regexExpression = new RegexExpression("(.*?)\\;\\s(.*?)\\;\\s(.*?)\\;\\s(.*?)\\_");
        String regex = regexExpression.getRegex();
        Matcher matcher = regexExpression.getMatcher(regex,fileContent);
        while (matcher.find()){
            students.add(new Student(matcher.group(1),matcher.group(2),matcher.group(3),(Integer.valueOf(matcher.group(4)))));
        }
        return students;
    }
    public void exportToFile(ArrayList<Student> students) throws IOException {
        file = new FileIO();
        String filePath = "/home/vutienbka/IdeaProjects/absolute-number-caculattor/src/FinalTestModule2/textfile/sapxepdiem.txt";
        file.writeToFile(students,filePath);
    }

    public Student findStudentById(ArrayList<Student> students, String ID){
        for(Student student: students){
            if(student.getId().equals(ID))
                return student;
        }
        return null;
    }
    public ArrayList<Student> findByLastName(ArrayList<Student> students, String lastName){
        ArrayList<Student> studentListWithTheSameLastName = new ArrayList<>();
        // Dung chuoi khong khong co dau
        //RegexExpression regexExpression = new RegexExpression("^(\\w+)\\s(.+)\\s(.+)$");
        // Dung cho chuoi tieng viet co dau
        RegexExpression regexExpression = new RegexExpression("^(\\p{L}+)\\s(.+)\\s(.+)$");
        String regex = regexExpression.getRegex();
        for (Student student : students) {
            Matcher matcher = regexExpression.getMatcher(regex,student.getName());
            while (matcher.find()){
                if(matcher.group(1).compareTo(lastName) == 0)
                    studentListWithTheSameLastName.add(student);
            }
        }
        return studentListWithTheSameLastName;
    }
}
