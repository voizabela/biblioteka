package pl.izabela.biblioteka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.izabela.biblioteka.User.UserService;
import pl.izabela.biblioteka.model.Book;
import pl.izabela.biblioteka.model.Borrow;
import pl.izabela.biblioteka.model.Users;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class BibliotekaApplication implements CommandLineRunner {

	private final BookService bookService;
	private final UserService userService;
	private final BorrowService borrowService;

	@Autowired
	public BibliotekaApplication(BookService bookService,UserService userService,BorrowService borrowService) {
		this.bookService = bookService;
		this.userService = userService;
		this.borrowService = borrowService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BibliotekaApplication.class, args);
	}




	@Override
	public void run(String... args) throws Exception {
		Book book1 = new Book("Pachnidło","Suskid Patrick");
		Book book2 = new Book("Harry Potter", "J.K. Rowling");
		Book book3 = new Book("Pan Tadeusz", "Adam Mickiewicz");

		Users user1 = new Users("Izabela","Vo","11111111111");
		Users user2 = new Users("Cezary", "Hudzik","22222222222");
		Users user3 = new Users("Anna", "Miwicz","33333333333");

		bookService.addBook(book1);
		bookService.addBook(book2);
		bookService.addBook(book3);

		userService.addUser(user1);
		userService.addUser(user2);
		userService.addUser(user3);

		Borrow borrow1 = new Borrow(LocalDateTime.now(),user1,book1);
		borrowService.rentBook(borrow1);

//		List<BookR> a = bookService.getAllBooks();
//
//		a.stream().forEach(System.out::println);
//
//		List<Users> b = userService.getAllUsers();
//
//		b.stream().forEach(System.out::println);
//
//		List<Borrow> wypozyczone = borrowService.getALLBorrows();
//
//		for(Borrow i :wypozyczone){
//			System.out.println(i.getBook());
//		}


		// select z wszystkich ksiazek not in (select borrrow






	}
}

