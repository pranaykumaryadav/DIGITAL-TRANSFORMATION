package com.niit.shoppingcart.dao;

import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Userdetails;

@EnableTransactionManagement
@Repository("userDetailsDAO")
public class UserdetailsDAOImpl implements UserdetailsDAO

{
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserdetailsDAOImpl( SessionFactory sessionFactory)
	{
	  this.sessionFactory = sessionFactory;
	  }
@Transactional	
public boolean save(Userdetails userdetails)
    {
      try {
		sessionFactory.getCurrentSession().save(userdetails)	;
		  return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	}
	@Transactional
	public boolean update(Userdetails userdetails)
	{
		try {
			sessionFactory.getCurrentSession().update(userdetails);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		

	}
	@Transactional
	public boolean delete(Userdetails userdetails)
	{  
		try {
			sessionFactory.getCurrentSession().delete(userdetails)	;
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			
		}	
		
	}
	@Transactional
	public Userdetails get(String id)
	{
		String hql = "from userdetails where id = " + " ' " + id + " ' ";
		 

	Query query	=sessionFactory.getCurrentSession().createQuery(hql) ;

	List<Userdetails>  list = query.list();
     
	
	if(list==null)
	{
		return null;
	}
	else
	{
		return list.get(0);
	}
	}
	
	public java.util.List<Userdetails>	list()
	{
		
		String hql =" from userdetails";
		
	
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
		
	}
}

	
	

 