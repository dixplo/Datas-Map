package com.ntd.datasmap.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import org.springframework.beans.factory.annotation.Autowired;

import com.ntd.datasmap.repositories.EventRepository;



/*Utilisation de EventRepository pour créer de la persistence*/

@Entity
public class Event {

	
	/*@Autowired
	private EventRepository eventRepo;
	*/
	// fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	private Date date;
	
	
	 @ManyToOne
	 private Type type;
	 

	// Controller
	public Event(String name, String description) {
		this.name = name;
		this.description = description;
		
		// Recupération de la date actuelle 
		Date actuelle = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(actuelle);
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




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}
}



