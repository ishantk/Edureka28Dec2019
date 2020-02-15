package co.edureka.app;

import org.springframework.aop.framework.ProxyFactoryBean; // to be configured in XML File for AOP
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Product;

public class SpringAOPApp {

	public static void main(String[] args) {
		
		// Spring core and Spring AOP jars to be configured for this Program :)
		// mvnrepository | spring.io

		// Inversion Of Control | IOC
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Product product = context.getBean("pRef", Product.class);
		Product product = context.getBean("productProxy", Product.class);
		System.out.println(product);	
		
		product.purchaseProduct("Redwood Shores", "evening");

		// 1-> BeforeAdvice 2->BusinessLogic 3->AfterAdvice
		// Configure BeforeAdvice, AfterAdvice in beans.xml for AOP to work
		// API -> ProxyFactoryBean also need to be configured in XML File
	}

}
