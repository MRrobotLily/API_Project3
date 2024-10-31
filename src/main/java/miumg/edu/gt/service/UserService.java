package miumg.edu.gt.service;

import java.util.List;

import miumg.edu.gt.entity.Users;


public interface UserService {

	List<Users> getAllUsers();
	Users getUserById(Long UserId);
	Users addUser(Users users);
	Users updateUser(Users users, Long UserId);
	String deleteUser(Long UserId);
	Users getUserByuserName(String userName);
}
