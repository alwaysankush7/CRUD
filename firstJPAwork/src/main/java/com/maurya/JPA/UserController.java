package com.maurya.JPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping("/user")
	Iterable<UserEntity> getAllUserDetails(){
		return service.getAllUsers();
	}
	
	@RequestMapping("/user/{id}")
	Optional<UserEntity> getuserById(@PathVariable int id){
		return service.getUserById(id);
	}
	
	@RequestMapping("user/{name}")
	List<UserEntity> getByUsingName(@PathVariable String name){
		return service.getByName(name);
	}
	
	@PostMapping("/user")
	void AddNewUser( @RequestBody UserEntity us) {
		service.addUser(us);
	}
	
	@PutMapping("user/{id}")
	void updateById(@RequestBody UserEntity us ,@PathVariable int id) {
		service.updateUser(us);
	}
	
	@DeleteMapping("user/{id}")
	void deleteUserById( @PathVariable int id) {
		service.deleteUser(id);
	}
	
}
