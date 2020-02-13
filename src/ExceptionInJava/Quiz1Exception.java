package ExceptionInJava;

public class Quiz1Exception {
        public static void main(String [] args)     {
            try {
                badMethod(); // vi khi thuc hien throw new RuntimeException se bo qua cac lenh con lai trong try va nhay den catch
                System.out.print("A");
            }catch (RuntimeException ex){
                System.out.print("B");
            }catch (Exception ex1){
                System.out.print("C");
            }finally{
                System.out.print("D");
            }
            System.out.print("E");
        }
        public static void badMethod(){
            throw new RuntimeException();
        }
}
