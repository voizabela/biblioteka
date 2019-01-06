package pl.izabela.biblioteka;

import org.springframework.stereotype.Service;
import pl.izabela.biblioteka.model.Author;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void addAuthor(Author author){
        authorRepository.save(author);
    }

    public List<Author> getAllAuthors(){
        return authorRepository.findAllAuthor();
    }

    public Author getAuthorByName(String firstName, String lastName){
        return authorRepository.findAuthorByFirstNameAndLastName(firstName,lastName);

    }
}
