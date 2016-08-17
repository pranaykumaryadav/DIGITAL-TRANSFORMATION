package com.niit.shoppingcart.dao;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Supplier;

import antlr.collections.List;

@Repository
public interface SupplierDAO {
	
	public boolean save(Supplier supplier);
	
	public boolean update(Supplier supplier);
	
	public boolean delete(Supplier supplier);
	
	public Supplier get(String id);
	
	public java.util.List<Supplier>	list();

}
