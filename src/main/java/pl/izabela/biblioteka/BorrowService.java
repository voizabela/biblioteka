package pl.izabela.biblioteka;

import org.springframework.stereotype.Service;
import pl.izabela.biblioteka.model.Borrow;

import java.util.List;

@Service
public class BorrowService {

    private final BorrowRepository borrowRepository;

    public BorrowService(BorrowRepository borrowRepository) {
        this.borrowRepository = borrowRepository;
    }

    public void rentBook(Borrow borrow){
        borrowRepository.save(borrow);

    }

    public List<Borrow> getALLBorrows(){
       return borrowRepository.findAllBorrow();
    }
}
