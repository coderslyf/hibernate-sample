package com.denken.hibernate.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.denken.hibernate.dao.UserDetails;



public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user =new UserDetails();
		user.setUserId(1);
		user.setUserName("Jimmy Kinnel");
		
		// persist the User object by saving it to the database by hibernate
		
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		

	}

}
