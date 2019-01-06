package pl.izabela.biblioteka;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.izabela.biblioteka.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {

    @Query("SELECT c FROM Book c ")
    List<Book> findAllBooks();

    List<Book> findAllByBookAuthor(String author);

    List<Book> findAllByTitle(String title);

    List<Book> removeBookByIdBook(Long id);

    boolean findBookByBookAuthorAndTitle(String BookAuthor, String Title);





}
