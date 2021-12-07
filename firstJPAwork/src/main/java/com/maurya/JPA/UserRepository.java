package com.maurya.JPA;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<UserEntity, Integer> {
	List<UserEntity> findByName(String name);

}
