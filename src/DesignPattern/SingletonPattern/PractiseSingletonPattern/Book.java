package DesignPattern.SingletonPattern.PractiseSingletonPattern;

public class Book {
    private static Book book;
    private static boolean isBorrowed;
    private String title;
    private String author;


    private Book(){
        title = "eCommer Programing system";
        author = "Jonh, Maichiel";
        book = null;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public static Book loanBook(){
        if(!isBorrowed){
                try {
                book = new Book();
                isBorrowed = true;
                return book;
            }catch (Exception e){
                throw new RuntimeException("Cannot create book");
            }
        }else return null;
    }

    public void getLoanedBook(){
        isBorrowed = false;
    }
}
