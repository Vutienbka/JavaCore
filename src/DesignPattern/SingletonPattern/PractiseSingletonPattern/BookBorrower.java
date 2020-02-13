package DesignPattern.SingletonPattern.PractiseSingletonPattern;

public class BookBorrower {
    Book borrowedBook;
    private boolean haveBook = false;
    public BookBorrower() {
    }
    public void borrowBook(){
        borrowedBook = Book.loanBook();
        if(borrowedBook == null){
            haveBook = false;
        }
        else
            haveBook = true;
    }

    public void returnBook(Book borrowedBook){
        borrowedBook.getLoanedBook();
    }
}
