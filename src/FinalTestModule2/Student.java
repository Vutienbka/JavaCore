package FinalTestModule2;

public class Student {

    private String Id;
    private String name;
    private String email;
    private Integer grade;

    public Student() {
    }
    public Student(String id, String name, String email, Integer grade) {
        Id = id;
        this.name = name;
        this.email = email;
        this.grade = grade;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
