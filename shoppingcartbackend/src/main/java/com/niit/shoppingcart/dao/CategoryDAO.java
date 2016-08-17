package com.niit.shoppingcart.dao;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Category;

import antlr.collections.List;

@Repository
public interface CategoryDAO {
	
	public boolean save(Category category);
	
	public boolean update(Category category);
	
	public boolean delete(Category Category);
	
	public Category get(String id);
	
	public java.util.List<Category>	list();

}
