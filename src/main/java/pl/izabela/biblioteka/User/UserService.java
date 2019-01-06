package pl.izabela.biblioteka.User;

import org.springframework.stereotype.Service;
import pl.izabela.biblioteka.model.Users;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(Users user){
        userRepository.save(user);
    }

    public List<Users> getAllUsers(){
        return userRepository.findAllUsers();
    }
}
