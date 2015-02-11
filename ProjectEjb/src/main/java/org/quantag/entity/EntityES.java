package org.quantag.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;





/**
 * The persistent class for the localebase database table.
 * 
 */
@Entity
@Table(name = "localebase")
public class EntityES extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "KEYID", nullable = false)
	private String key;
	@Column(name = "ES", nullable = false)
	private String value;

	public EntityES() {
	}
	
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "EntityES [key=" + key + ", value=" + value + "]";
	}

	
}
