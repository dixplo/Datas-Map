package com.ntd.datasmap.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



/*Utilisation de EventRepository pour créer de la persistence*/

@Entity
public class Event {

	// fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	private Date date;
	
	/*@OneToMany(cascade = CascadeType.ALL,mappedBy = "event")
	private List<Group> groups;
	*/
	
	/* Un event a un a plusieurs types */
	/*@OneToMany(cascade = CascadeType.ALL,mappedBy = "type")
	private List<Type> type;
	*/
	
	// Controller
	public Event(String name, String description) {
		this.name = name;
		this.description = description;
		
		// Recupération de la date actuelle 
		Date actuelle = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 String dat = dateFormat.format(actuelle);
		
		/*Declaration de l'arrayList des types */
		//type=new ArrayList<>();
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



