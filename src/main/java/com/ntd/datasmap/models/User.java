package com.ntd.datasmap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	
	
	private String userName;

	private String email;

	private String password;


	
	public User(String userName, String email, String password) {
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	
	
	
	public String getName() {
		return userName;
	}

	public void setName(String name) {
		this.userName = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

	

