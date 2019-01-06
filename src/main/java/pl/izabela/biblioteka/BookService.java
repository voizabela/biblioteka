package pl.izabela.biblioteka;

import org.springframework.stereotype.Service;
import pl.izabela.biblioteka.model.Author;
import pl.izabela.biblioteka.model.Book;
import pl.izabela.biblioteka.web.BookMapper;
import pl.izabela.biblioteka.web.BookResponse;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;
    private final AuthorService authorService;

    public BookService(BookRepository bookRepository, BookMapper bookMapper,
                       AuthorService authorService) {

        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
        this.authorService = authorService;

    }

    public void addBook(Book book){

//        if(bookRepository.findBookByBookAuthorAndTitle(book.getBookAuthor(),book.getTitle())){
//            System.out.println("ksiazka jest w rejestrze");
//        }
//        else{
//
//        }



        bookRepository.save(book);
//        String first_name = book.getBookAuthor().substring(0,book.getBookAuthor().indexOf(" "));
//        String last_name =  book.getBookAuthor().substring(book.getBookAuthor().indexOf(" "));
//        authorService.addAuthor(new Author(first_name, last_name));

    }

    public List<BookResponse> getAllBooks(){
        return bookRepository.findAllBooks().stream().map(bookMapper::map).collect(toList());
    }
    public List<Book> getBooksByAuthor(String author){
        return bookRepository.findAllByBookAuthor(author);
    }


    public BookResponse getOne(Long id) {
        Book book = bookRepository.findById(id).get();
        return new BookResponse(book.getTitle(),book.getBookAuthor());
    }

    public void removeBook(Long id){
        bookRepository.removeBookByIdBook(id);

    }

    public Long getAuthorId(String firstName, String lastName){
        Author author = authorService.getAuthorByName(firstName, lastName);
        return author.getIdAuthor();

    }




}
