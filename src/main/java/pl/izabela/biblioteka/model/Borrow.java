package pl.izabela.biblioteka.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBorrow;
    private LocalDateTime createdAt;
    @ManyToOne
    private Users user;
    @ManyToOne
    private Book book;

    public Borrow(LocalDateTime createdAt, Users user, Book book) {
        this.createdAt = createdAt;
        this.user = user;
        this.book = book;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Borrow() {
    }

    public Users getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "createdAt=" + createdAt +
                ", user=" + user +
                ", book=" + book +
                '}';
    }

    public Long getIdBorrow() {
        return idBorrow;
    }

    public void setIdBorrow(Long idBorrow) {
        this.idBorrow = idBorrow;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
