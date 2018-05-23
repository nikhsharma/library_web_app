import models.Book;
import models.Borrower;
import models.Library;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library1;

    @Before
    public void before() throws Exception {
        library1 = new Library("The Grand Library");
        borrower = new Borrower("Bob");
        book = new Book("Book", "Mr. Book", library1);
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(book);
        assertEquals(1, borrower.bookCount());
    }

//    @Test
//    public void canReturnBook() {
//        borrower.borrowBook(book);
//        borrower.borrowBook(book);
//        borrower.returnBook();
//        assertEquals(1, borrower.bookCount());
//    }
}
