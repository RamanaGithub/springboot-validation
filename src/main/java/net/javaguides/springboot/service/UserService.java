package net.javaguides.springboot.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}	
	
	/*public List<User> getUser() {
		return userRepository.findAll();
	}	*/
	
	 public List<User> getUsers() {
	        return userRepository.findAll();
	    }

}
