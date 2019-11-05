package com.ntd.datasmap.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Place {

	
	// fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String address;
	private Float latitude;
	private Float longitude;

	
	@OneToMany(mappedBy="pl")
	private List<Event>Events;
	
	@OneToMany(mappedBy="pl2")
	private List<Site>Sites;
	
	/*Controller*/
	public Place(String address, Float latitude, Float longitude) {
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
	}


	
	
	
	
	// GETTER AND SETTER
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Float getLatitude() {
		return latitude;
	}


	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}


	public Float getLongitude() {
		return longitude;
	}


	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}






	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}
	
}
