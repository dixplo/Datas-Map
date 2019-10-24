package com.ntd.datasmap.models;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Type {

	// fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	
    @OneToMany
    private Collection<Type> types;
	
	/*@OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
	private Set<Event> event;
	 */
	
	// Controller
	public Type(String name, String description) {
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
	
	
	
}
