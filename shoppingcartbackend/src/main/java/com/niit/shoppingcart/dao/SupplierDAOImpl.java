


package com.niit.shoppingcart.dao;

import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Supplier;
@EnableTransactionManagement
@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO

{
	@Autowired
	private SessionFactory sessionFactory;
	
	public SupplierDAOImpl( SessionFactory sessionFactory)
	{
	  this.sessionFactory = sessionFactory;
	  }
@Transactional	
public boolean save(Supplier supplier)
    {
      try {
		sessionFactory.getCurrentSession().save(supplier)	;
		  return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	}
	@Transactional
	public boolean update(Supplier supplier)
	{
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		

	}
	@Transactional
	public boolean delete(Supplier supplier)
	{  
		try {
			sessionFactory.getCurrentSession().delete(supplier)	;
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			
		}	
		
	}
	@Transactional
	public Supplier get(String id)
	{
		String hql = "from supplier where id = " + " ' " + id + " ' ";
		 

	Query query	=sessionFactory.getCurrentSession().createQuery(hql) ;

	List<Supplier>  list = query.list();
     
	
	if(list==null)
	{
		return null;
	}
	else
	{
		return list.get(0);
	}
	}
	
	public java.util.List<Supplier>	list()
	{
		
		String hql =" from supplier";
		
	
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
		
	}
}

	
	

 