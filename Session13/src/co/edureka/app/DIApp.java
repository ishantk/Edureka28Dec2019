package co.edureka.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.CB;
import co.edureka.bean.Restaurant;

public class DIApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
		//Restaurant restaurant = context.getBean("rRef", Restaurant.class);
		//System.out.println(restaurant);
		//System.out.println(restaurant.getDepartments());
		
		CB cRef = context.getBean("cb", CB.class);
		cRef.getCa().sayHello("John");

	}

}
