package miumg.edu.gt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import miumg.edu.gt.entity.Users;
import miumg.edu.gt.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/Users")
	public ResponseEntity<List<Users>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@GetMapping("/Users/{UserId}")
	public ResponseEntity<Users> getUserById(@PathVariable("UserId") Long UserId){
		return ResponseEntity.ok(userService.getUserById(UserId));
	}
	
	@PostMapping("/Users")
	public ResponseEntity<Users> addUser(@RequestBody Users users){
		return ResponseEntity.ok(userService.addUser(users));
	}
	
	@PatchMapping("/Users")
	public ResponseEntity<Users> updateUser(@RequestBody Users users, @PathVariable("UserId") Long UserId){
		return ResponseEntity.ok(userService.updateUser(users, UserId));
	}
	
	@DeleteMapping("/Users/{UserId}")
	public ResponseEntity<String> deleteUser(@PathVariable("UserId") Long UserId){
		return ResponseEntity.ok(userService.deleteUser(UserId));
	}
}
