package miumg.edu.gt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miumg.edu.gt.entity.Users;
import miumg.edu.gt.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Users> getAllUsers() {
		return (List<Users>) userRepository.findAll();
	}

	@Override
	public Users getUserById(Long UserId) {
		return userRepository.findById(UserId).get();
	}

	@Override
	public Users addUser(Users users) {
		 Optional<Users> existingUsers = userRepository.findByuserName(users.getuserName());
		    if (existingUsers.isPresent()) {
		        throw new IllegalArgumentException("El Nombre de usuario ya está registrado, Ingrese uno nuevo por favor");
		    }
		return userRepository.save(users);
	}

	@Override
	public Users updateUser(Users users, Long UserId) {
		Users UserObj = userRepository.findById(UserId).get();
		if (UserObj != null) {
			UserObj.setuserName(users.getuserName());
			UserObj.setPassword (users.getPassword());
		}
		return userRepository.save(UserObj);
	}

	@Override
	public String deleteUser(Long UserId) {
		Users UserObj = userRepository.findById(UserId).get();
		if (UserObj != null) {
			userRepository.delete(UserObj);
		}
		return "Usuario eliminado con exito!";
	}
	
}
