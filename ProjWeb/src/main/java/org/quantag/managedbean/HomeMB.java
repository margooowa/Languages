package org.quantag.managedbean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.quantag.entitiesbean.userdata.UserDataFacadeLocal;
import org.quantag.entity.EntityUserdata;

/**
 * Managed bean.
 * 
 */
@SessionScoped
@ManagedBean
public class HomeMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private Logger logger = Logger.getLogger(getClass().getName());
	@EJB
	private UserDataFacadeLocal userEJB;
	@ManagedProperty(value = "#{localeMB}")
	private LocaleMB localeMB;
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private EntityUserdata user;

	@PostConstruct
	private void init() {
	}

	public void saveData() {
		String locale = localeMB.getLocale().getLanguage();
		user = new EntityUserdata(firstName, lastName, street, city, locale);
		userEJB.create(user);
		logger.info("Data was saves");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public EntityUserdata getUser() {
		return user;
	}

	public void setUser(EntityUserdata user) {
		this.user = user;
	}

	public LocaleMB getLocaleMB() {
		return localeMB;
	}

	public void setLocaleMB(LocaleMB localeMB) {
		this.localeMB = localeMB;
	}

}
