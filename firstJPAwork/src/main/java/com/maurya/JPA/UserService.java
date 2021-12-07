package com.maurya.JPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	Iterable<UserEntity> getAllUsers(){
		return repo.findAll();
	}
	
	Optional<UserEntity> getUserById(int id){
		return repo.findById(id);
	}
	
	List<UserEntity> getByName(String name){
		return repo.findByName(name);
	}
	
	void addUser(UserEntity us){
		 repo.save(us);
	}
	
	void updateUser(UserEntity us) {
		repo.save(us);
	}
	
	void deleteUser(int id){
		repo.deleteById(id);
	}
}
