package com.ntd.datasmap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*Utilisation de EventRepository pour créer de la persistence*/

@Entity
public class Event {

	// fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	private int date;
	
	// Controller
	public Event(String name, String description) {
		this.name = name;
		this.description = description;
	}

	
	// GETTER AND SETTER
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}




	public int getDate() {
		return date;
	}




	public void setDate(int date) {
		this.date = date;
	}
}



