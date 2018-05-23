import db.DBHelper;
import models.Book;
import models.Borrower;
import models.Library;

public class DBRunner {

    public static void main(String[] args) {

        Library library1 = new Library("The Grand Library");
        DBHelper.save(library1);

        Book book1 = new Book("Harry Potter and Prisoner of Azkaban ", "J.K Rowling", library1);
        DBHelper.save(book1);
        Book book2 = new Book("1984", "George Orwell", library1);
        DBHelper.save(book2);
        Book book3 = new Book ("Lord of the Flies", "William Golding", library1);
        DBHelper.save(book3);
        Book book4 = new Book("Animal Farm", "George Orwell", library1);
        DBHelper.save(book4);

        Borrower borrower1 = new Borrower("Nikhil Sharma");
        DBHelper.save(borrower1);
        Borrower borrower2 = new Borrower("Ruaridh Dunbar");
        DBHelper.save(borrower2);
        Borrower borrower3 = new Borrower("George Orwell");
        DBHelper.save(borrower3);



    }
}
