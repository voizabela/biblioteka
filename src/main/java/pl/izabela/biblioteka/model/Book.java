package pl.izabela.biblioteka.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;
    private String title;

    @OneToMany(mappedBy = "book")
    private Set<Borrow> borrow;

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors = new HashSet<>();


    public Book(String title, Author author) {
        this.title = title;
        authors.add(author);
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + authors + '\'' +
                '}';
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Set<Borrow> getBorrow() {
        return borrow;
    }

    public void setBorrow(Set<Borrow> borrow) {
        this.borrow = borrow;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
