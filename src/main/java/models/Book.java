package models;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {

    private String title;
    private String author;
    private Borrower borrower;
    private int id;
    private Library library;

    public Book() {
    }

    public Book(String title, String author, Library library) {
        this.library = library;
        this.title = title;
        this.author = author;
    }
    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name="author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @ManyToOne
    @JoinColumn(name = "borrower_id", nullable = false)
    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    @Id
    @GeneratedValue
    @Column(name="Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name="library_id", nullable = false)
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
