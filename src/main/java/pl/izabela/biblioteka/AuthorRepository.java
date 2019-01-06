package pl.izabela.biblioteka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.izabela.biblioteka.model.Author;


import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {

    @Query("SELECT c FROM Author c ")
    List<Author> findAllAuthor();

    Author findAuthorByIdAuthor(Long id);

    Author findAuthorByFirstNameAndLastName(String firstName, String lastName);

}
