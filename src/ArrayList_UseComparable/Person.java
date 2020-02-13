package ArrayList_UseComparable;

public class Person implements Comparable<Person>{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    // Dung id de so sanh hai doi tuong
//    @Override
//    public int compareTo(Person person) {
//        if(this.id > person.getId())
//            return 1;
//        else if (this.id < person.getId())
//            return -1; // phan tu nay se sap xep truoc phan tu so sanh
//        else return 0;
//    }
    // Dung name de so sanh hai doi tuong
    @Override
    public int compareTo(Person person) {
       return this.name.compareTo(person.getName());
       // Sap xep theo gia tri nguoc lai
//        return -(this.name.compareTo(person.getName()));
    }
}
//Ham equals de so sanh chuoi trong java