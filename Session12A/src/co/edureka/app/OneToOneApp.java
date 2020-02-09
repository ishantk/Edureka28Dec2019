package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Address;
import co.edureka.model.Restaurant;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant();
		restaurant.setName("Johns Coffee Shop");
		restaurant.setPhone("+91 99999 77777");
		restaurant.setOperatingHours("10:00 AM - 11:00 PM");
		restaurant.setReviews(4.5f);
		restaurant.setPricePerPerson(300);
		
		Address address = new Address();
		address.setAdrsLine("Redwood Shores");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setZipCode(520001);
		
		// One to One Mapping in Both Objects
		//restaurant.setAddress(address);
		address.setRestaurant(restaurant);
		
		// Displaying Data
		System.out.println(restaurant);
		//System.out.println(restaurant.getAddress());
		
		// Persist the Data in DataBase with Hibernate
		// We will create 2 Tables, Restaurant and Address
		// And whatever is RID in Restaurant should be AID in Address
		
		// SessionFactory is used to create Session
		SessionFactory sessionFactory = null;
		
		// Session API is connection to the DataBase and shall provide further APIs
		// APIs like: save, update, delete and query to perform DB Operations
		Session session = null;
		
		// For Any Operation in Hibernate it goes as Atomic(All at Once i.e. Transaction)
		Transaction transaction = null;
		
		// Parse hibernate.cfg.xml file using APO StandardServiceRegistry in Hibernate
		// And obtain reference to SessionFactory Object
		try {
			
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.configure()
					.build();
			
			// Obtain the reference to sessionFactory
			sessionFactory = new MetadataSources(registry)
					.buildMetadata()
					.buildSessionFactory();
			
			// obtain session
			session = sessionFactory.openSession();
			
			// obtain transaction
			transaction = session.getTransaction();
			transaction.begin();

			// We will save only Restaurant object and due to cascade = "all", Address object will be saved alongwith Restaurant Object
			//session.save(restaurant);
			
			transaction.commit();
			System.out.println(">> Transaction Finished :) ");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
	}

}
