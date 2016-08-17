package com.niit.shoppingcart.dao;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Product;

import antlr.collections.List;

@Repository
public interface ProductDAO {
	
	public boolean save(Product product);
	
	public boolean update(Product product);
	
	public boolean delete(Product product);
	
	public Product get(String id);
	
	public java.util.List<Product>	list();

}
