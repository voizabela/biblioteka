package pl.izabela.biblioteka.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.izabela.biblioteka.model.Users;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<Users,Long> {

    @Query("SELECT c FROM Users c ")
    List<Users> findAllUsers();

    List<Users> findAllByFirstNameAndLastName(String firstName, String lastName);


}
