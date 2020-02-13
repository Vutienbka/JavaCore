package StudentLinkedList;

public class Student {
    private int index;
    private String id, name, address, position;


    public Student(int index, String id, String name, String address, String position) {
        this.index = index;
        this.id = id;
        this.name = name;
        this.address = address;
        this.position = position;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIndex() {
        return this.index;
    }

    public void setId(int index) {
        this.index = index;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void display() {
        System.out.printf("%-10s%-10s%-20s%-20s%-20s\n", this.index, this.id, this.name, this.address, this.position);
    }


}