package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Burger;
import co.edureka.model.Dish;
import co.edureka.model.VeggieBurger;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Dish dish = new Dish();
		dish.setName("Fried Rice");
		dish.setPrice(200);
		
		// Burger IS-A Dish
		Burger burger = new Burger();
		burger.setName("McBurger");
		burger.setPrice(100);
		burger.setBurgerName("Mc Veggie Burger");
		burger.setDressing("Tomato and Mayonise Dressing");
		
		// VeggieBurger IS-A Burger
		// VeggieBurger IS-A Dish
		VeggieBurger veggieBurger = new VeggieBurger();
		veggieBurger.setName("McKingBurger");
		veggieBurger.setPrice(100);
		veggieBurger.setBurgerName("Mc King Veggie Burger");
		veggieBurger.setDressing("Tomato and Mayonise Dressing");
		veggieBurger.setHerbs("Oregano");
		veggieBurger.setSpice("Chillies");
		
		System.out.println(dish);
		System.out.println(burger);
		System.out.println(veggieBurger);
		
		// Save the Related Data in Database
		// We want only 1 Table which should save all the records of this hierarchy
		// We will add a discriminator column, i.e. which will discriminate between records for different objects

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

			session.save(dish);
			session.save(burger);
			session.save(veggieBurger);
			
			transaction.commit();
			System.out.println(">> Transaction Finished :) ");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
	}

}
