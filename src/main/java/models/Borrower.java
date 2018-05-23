package models;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private int id;
    private String name;
    private List<Book> books;

    public Borrower(String name) {
        this.name = name;
        this.books =  new ArrayList<Book>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
