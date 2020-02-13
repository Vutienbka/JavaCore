package StudentArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student{
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/M/yyyy");
    Calendar calendar = Calendar.getInstance();
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String placeOfBirth;
    public Student() {
    }

    public Student(String id, String name, String dateOfBirth, String gender, String placeOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.placeOfBirth = placeOfBirth;
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

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public int getAge(Student student){
        final long ONE_HOUR = 60 * 60 * 1000L;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/M/yyyy");
        simpleDateFormat.setLenient(false);
        Date studentDateOfBirth = new Date();
        Date nowDate = new Date();
        try {
            studentDateOfBirth = simpleDateFormat.parse(student.getDateOfBirth());

        }catch (ParseException e){
            System.out.println("Invalid Date");
        }
        return (int) ( (nowDate.getTime() - studentDateOfBirth.getTime() + ONE_HOUR) / (ONE_HOUR*24) )/365;
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

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void displayMainInfo(){
        System.out.printf("Full Name:  %-30s ID: %-10s Date Of Birth: %-20sGender:  %-30s Place Of Birth: %-20s Age: %-10d\n", this.name, this.id,this.dateOfBirth, this.gender, this.placeOfBirth, this.getAge(this));
    }
    public void displaySecondaryInfo(){
        System.out.printf("Gender:  %-30s Place Of Birth: %-20s Age: %-10d\n", this.gender, this.placeOfBirth, this.getAge(this));
    }
}
