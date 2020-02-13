package DesignPattern.SingletonPattern.PractiseSingletonPattern;

public class Test {
    public static void main(String[] args){
        BookBorrower person1 = new BookBorrower();
        BookBorrower person2 = new BookBorrower();
        //Person1 muon sach
        try {
            person1.borrowBook();
            //Lay ten tac gia
            System.out.println(person1.borrowedBook.getAuthor());
            //Luc nay Person 2 khong the muon sach duoc vi person 1 chua tra --> throws NullPointerException
            person2.borrowBook();
            System.out.println(person2.borrowedBook.getAuthor());

        }catch (NullPointerException e){
            System.out.println("Book is not available");
        }

    }
}
