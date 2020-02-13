package ExceptionInJava;

public class Quiz2Exception {
    public static void main(String [] args) {
        try         {
            badMethod();
            System.out.print("A");
        }  catch (Exception ex)  {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }
    public static void badMethod(){
        throw new Error();
    }
}
// Van de la do throw mot error nhung lai catch mot exception
// Error va Exception la hai lop doc lap nhau cung ke thua lop Throwable vi vay catch block is not monitoring it
//An Error "indicates serious problems that a reasonable application should not try to catch."
// while An Exception "indicates conditions that a reasonable application might want to catch."
// Talking about your code, you're throwing an error and catching an exception,
// it must be evident by now that they are 2 discrete entities