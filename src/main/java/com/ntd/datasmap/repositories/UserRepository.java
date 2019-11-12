package com.ntd.datasmap.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntd.datasmap.models.User;;



@Repository
public interface UserRepository extends JpaRepository<User,Integer > {
	public List<User> findByUserName(String userName);
	public List<User> findByPassword(String password);
	
	
}
