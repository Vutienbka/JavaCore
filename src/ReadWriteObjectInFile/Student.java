package ReadWriteObjectInFile;

import java.io.Serializable;
public class Student implements Serializable {
    private String ID;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String placeOfBirth;
    public Student() {
    }
    public Student(String ID, String name, String dateOfBirth, String gender, String address) {
        this.ID = ID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.placeOfBirth = address;
    }
    public String getId() {
        return ID;
    }
    public void setId(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
    public void setPlaceOfBirth(String address) {
        this.placeOfBirth = address;
    }
    public void displayMainInfo(){
        System.out.println("Id: " + ID + " Name: " + name + " date Of Birth: " + dateOfBirth + " Gender: " + gender + " Place Of Birth: " + placeOfBirth);
    }
}