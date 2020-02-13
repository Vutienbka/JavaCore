package ExceptionInJava;

public class NullPointerException {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //NullPointerException pointer = null;
        //System.out.println(pointer.getName());
        //--> Gọi một Instance method của một null object.

        //String[] strings = null;
        //System.out.println(strings.length);
        //Lấy độ dài của  một mảng Null.

        //NullPointerException pointer = new NullPointerException();
        //pointer.Hello();
        //Truy cap vao null method trong object
    }

}
