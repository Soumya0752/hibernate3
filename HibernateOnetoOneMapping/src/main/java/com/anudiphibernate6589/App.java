package com.anudiphibernate6589;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Cart;
import com.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        
        try 
        {
        	Customer c1=new Customer();
        	c1.setName("customer1");
        	c1.setPhnno(12345);
        	
        	Cart cart1=new Cart();
        	cart1.setPrice(5000);
        	
        	c1.setCart(cart1);
        	cart1.setCustomer(c1);
        	
        	session.beginTransaction();
        	session.save(c1);
        	session.save(cart1);
        	session.getTransaction().commit();
        	
        	
        	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally 
        {
        	 session.close();
        	 factory.close();
        }
    }
}
