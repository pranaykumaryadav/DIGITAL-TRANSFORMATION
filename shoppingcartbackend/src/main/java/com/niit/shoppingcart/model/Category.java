package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


import org.springframework.stereotype.Component;

@Entity 
@Table(name="catogory")
@Component	

public class Category {
	
	@Id
	private String id ;
	private String description;
	private String name;
	
	@Transient
	private String createdBy;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
