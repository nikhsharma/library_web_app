import models.Book;
import models.Borrower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before() throws Exception {
        borrower = new Borrower("Bob");
        book = new Book("Book", "Mr. Book");
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(book);
        assertEquals(1, borrower.bookCount());
    }
}
