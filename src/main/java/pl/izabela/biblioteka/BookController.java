package pl.izabela.biblioteka;

import org.springframework.data.annotation.Transient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import pl.izabela.biblioteka.model.Book;
import pl.izabela.biblioteka.web.BookResponse;

import java.util.List;

@RestController
@RequestMapping("/biblio")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookResponse> getAll(){
        return bookService.getAllBooks();

    }

    @Transactional
    @PostMapping
    public ResponseEntity add(@RequestBody Book book){
        bookService.addBook(book);
        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public BookResponse getOne(@PathVariable("id") Long id) {
        return bookService.getOne(id);
    }


//    @Transactional
//    @DeleteMapping("/{id}")
//    public ResponseEntity delete(@PathVariable("id") Long id) {
//        bookService.removeBook(id);
//        return ResponseEntity.ok(HttpStatus.OK);
//    }





}
