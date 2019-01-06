package pl.izabela.biblioteka.web;

import org.springframework.stereotype.Component;
import pl.izabela.biblioteka.model.Author;
import pl.izabela.biblioteka.model.Book;

@Component
public class BookMapper {

    public BookResponse map(Book book){

        return new BookResponse(book.getTitle(),book.getBookAuthor());

    }

//    public Author createNewAuthor(Book book){
//        Author author = new Author();
//        author.setFirstName(book.getBookAuthor().);
//
//    }

}
