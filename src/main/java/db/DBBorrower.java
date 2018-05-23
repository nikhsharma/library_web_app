package db;

import models.Book;
import models.Borrower;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBBorrower {

    private static Session session;

    public static List<Book> allBooks(Borrower borrower) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Book> books = null;

        try {
            Criteria cr = session.createCriteria(Book.class);
            cr.add(Restrictions.eq("borrower.id", borrower.getId()));
            books = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return books;
    }
}
