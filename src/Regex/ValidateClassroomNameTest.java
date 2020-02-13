package Regex;

public class ValidateClassroomNameTest {
    public static void main(String[] args) {
        ValidateClassroomName validateClassroomName = new ValidateClassroomName();
        String[] string = {"C0318G","M0318G","P0323A","C0138.G"};
        for(String str : string){
            System.out.println("Classroom Name "+ str + " is :" + (validateClassroomName.isClassRoomRegex(str) ? " valid": " invalid"));
        }
    }
}
