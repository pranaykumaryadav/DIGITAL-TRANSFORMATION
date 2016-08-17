package com.niit.shoppingcartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.dao.CategoryDAO;


public class CategoryTest {
	
		
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
	
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("catergoryDAO");
		Category category = (Category) context.getBean("catergory");
		
		category.setId("CG001");
		category.setName("CGName001");
		category.setDescription("This is category001 description");
		
		
     if  ( categoryDAO.save(category) == true)
		
     {
	   System.out.println("Category created successfully");
		
	}
     else

     {
    	 System.out.println("Not able to creat the  Category ");
     }

	}
}
