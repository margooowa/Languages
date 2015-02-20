package org.quantag.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the userdata database table.
 * 
 */
@Entity
@Table(name = "userdata")
@NamedQuery(name = "Userdata.findAll", query = "SELECT u FROM EntityUserdata u")
public class EntityUserdata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String city;
	private String firstname;
	private String language;
	private String lastname;
	private String street;

	public EntityUserdata() {
	}
	
	

	public EntityUserdata(String firstname, String lastname, String street, String city, String language) {
		super();
		this.city = city;
		this.firstname = firstname;
		this.language = language;
		this.lastname = lastname;
		this.street = street;
	}



	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
