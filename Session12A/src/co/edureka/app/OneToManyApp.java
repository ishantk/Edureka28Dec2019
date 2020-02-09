package co.edureka.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Dish;
import co.edureka.model.Restaurant;

public class OneToManyApp {

	public static void main(String[] args) {

		Dish dish1 = new Dish(null, "Chilli Garlic Noodles", 300);
		Dish dish2 = new Dish(null, "Manchurian", 200);
		Dish dish3 = new Dish(null, "Fried Rice", 150);
		
		List<Dish> list1 = new ArrayList<Dish>();
		list1.add(dish1); // 0
		list1.add(dish2); // 1
		//list1.add(dish3); // 2
		
		Restaurant restaurant = new Restaurant();
		restaurant.setName("Fionnas Chinese");
		restaurant.setPhone("+91 90909 77777");
		restaurant.setOperatingHours("10:00 AM - 11:00 PM");
		restaurant.setReviews(4.75f);
		restaurant.setPricePerPerson(200);
		
		// One to Many Object Mapping :)
		restaurant.setDishes(list1);
		
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

			// We will save only Restaurant object and due to cascade = "all", Dish objects will be saved alongwith Restaurant Object
			//session.save(restaurant);
			
			Restaurant restaurant2 = session.get(Restaurant.class, 2);
			System.out.println(restaurant2);
			
			List<Dish> dishes = restaurant2.getDishes();
			
			for(Dish dish : dishes) {
				System.out.println(dish);
			}
			
			transaction.commit();
			System.out.println(">> Transaction Finished :) ");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		
		
	}

}
