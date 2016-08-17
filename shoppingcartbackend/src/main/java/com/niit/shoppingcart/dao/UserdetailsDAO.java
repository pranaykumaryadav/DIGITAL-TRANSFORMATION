package com.niit.shoppingcart.dao;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Userdetails;

import antlr.collections.List;

@Repository
public interface UserdetailsDAO {
	
	public boolean save(Userdetails userdetails);
	
	public boolean update(Userdetails userdetails);
	
	public boolean delete(Userdetails userdetails);
	
	public Userdetails get(String id);
	
	public java.util.List<Userdetails>	list();

}
