package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "borrowers")
public class Borrower {
    private int id;
    private String name;
    private List<Book> books;

    public Borrower(String name) {
        this.name = name;
        this.books =  new ArrayList<Book>();
    }

    public Borrower() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "borrower")
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int bookCount() {
        return books.size();
    }

    public void borrowBook(Book book, Library library) {
        this.books.add(book);
        library.lendBook(book);
    }

    public void returnBook(Book book, Library library) {
        this.books.remove(book);
        library.receiveBook(book);
    }
}
