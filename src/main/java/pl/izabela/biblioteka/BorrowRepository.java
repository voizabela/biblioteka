package pl.izabela.biblioteka;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.izabela.biblioteka.model.Book;
import pl.izabela.biblioteka.model.Borrow;

import java.util.List;

public interface BorrowRepository extends CrudRepository<Borrow,Long> {

    @Query("SELECT c FROM Borrow c ")
    List<Borrow> findAllBorrow();



}
