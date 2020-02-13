package QueueStack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    public Student() {
    }

    public Student(String id, String name, String dateOfBirth, String gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void displayMainInfo(){
        System.out.printf("ID: %-10s Full Name:  %-30s Date Of Birth: %-20s  Gender:  %-30s \n", this.id,this.name, this.dateOfBirth, this.gender);
    }
}

