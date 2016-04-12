package com.jarek.zyzak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jarek.zyzak.model.Phone;
import com.jarek.zyzak.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	save();
    	//
    	ListAll();
    }

	private static void save() {
		Session session = build().openSession();    
		Transaction transaction = session.beginTransaction();
		Set<Phone> phoneNumbers = new HashSet<Phone>();
    	phoneNumbers.add(new Phone("house", "11111111"));
    	phoneNumbers.add(new Phone("mobile","55555555"));
    	
    	Student student = new Student("Jarek", phoneNumbers);
    	session.save(student);
    	transaction.commit();
    	session.close();
	}
	
	private static void ListAll(){
		Session session = build().openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from Phone");
    	List<Phone> phones = query.list();    	    
    	for(Phone p: phones){
    		System.out.println(p.getPhone_Number());
    	}
    	    	
    	transaction.commit();
    	session.close();
	}
    
    public static SessionFactory build(){
    	SessionFactory sessionFactory;
    	sessionFactory = new Configuration().configure().buildSessionFactory();
    	return sessionFactory;
    }
}
