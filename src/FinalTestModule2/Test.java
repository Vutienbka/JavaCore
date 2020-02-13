package FinalTestModule2;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<Student> studentList = new ArrayList<>();
        StudentManage student = new StudentManage();
//Add List From file
        studentList = student.AddList();
// Display students has grade greater than 85
        //ChooseDisplayType chooseDisplayType1 = ChooseDisplayType.GRADE_GREATER_THAN_85;
        //student.display(chooseDisplayType1,studentList);
// Display students with grade descending
        //ChooseDisplayType chooseDisplayType2 = ChooseDisplayType.GRADE_DESCENDING;
        //student.display(chooseDisplayType2,studentList);
//Write to file
        //student.exportToFile(student.sortGradeDescending(studentList));
//Display student by selecting ID
        //ChooseDisplayType chooseDisplayType3 = ChooseDisplayType.BY_SELECTED_ID;
        //student.display(chooseDisplayType3,studentList);
// Display students with name ascending. At first, sort name ascending if the same name sort with grade ascending
        //ChooseDisplayType chooseDisplayType4 = ChooseDisplayType.SORT_NAME_GRADE;
        //student.display(chooseDisplayType4,studentList);
//At first, sort last name ascending if the same last name sort first name ascending
        ChooseDisplayType chooseDisplayType5 = ChooseDisplayType.SORT_LASTNAME_FIRSTNAME;
        student.display(chooseDisplayType5,studentList);
//Find student by last name
        //ChooseDisplayType chooseDisplayType6 = ChooseDisplayType.FIND_BY_LASTNAME;
        //student.display(chooseDisplayType6);
    }
}
