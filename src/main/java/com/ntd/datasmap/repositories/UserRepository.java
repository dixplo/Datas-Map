package com.ntd.datasmap.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntd.datasmap.models.User;;

public interface UserRepository extends JpaRepository<User,Integer > {
	/*public List<User> findByLogin(String login);*/
	
}
