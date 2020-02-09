package co.edureka.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Pizza;

public class InheritanceApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("inheritance.xml");
		Pizza pizza = context.getBean("pRef", Pizza.class);
		
		System.out.println(pizza);

	}

}
