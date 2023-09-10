package com.java.oneonone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	
	public static void main(String[] args) {
	
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA");
		EntityManager em=factory.createEntityManager();
	    em.getTransaction().begin();
	    
	    Student s1=new Student();
	    s1.setName("Vina");
	     
	    Address a1=new Address();
	    a1.setStreetname("MG road");
	    a1.setCity("Pune");
	    a1.setState("Maharashtra");
	    a1.setZipcode(413306);
	    
	    //inject address into student 
	    s1.setAddress(a1);
	    
	    //persist/insert only student,no need to insert address explicitly
	    em.persist(s1);
	    em.getTransaction().commit();
	    
	    System.out.println("Added one student with address to database");
	    
	    em.close();
	    factory.close();
	}
}
