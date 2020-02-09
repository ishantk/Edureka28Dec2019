package co.edureka.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.bean.Connection;

public class App {

	public static void main(String[] args) {
		
		/*Connection con1 = new Connection();
		con1.setUrl("http://abc.com/db1");
		con1.setUser("john");
		con1.setPassword("john123");
		
		Connection con2 = new Connection("http://xyz.com/db2", "fionna", "fionna123");
		
		System.out.println(con1);
		System.out.println(con2);*/
		
		// Challenge:
		// In Case any value in object has to be modified, we will change it on our source code
		// re compile the code for changes
		// re test the app
		// re deploy it to client
		
		// Solution:
		// Spring FW | IOC Principle
		// IOC - Inversion of Control
		// We will not create objects, in source. That will be taken care by Spring FW's IOC Container
		// We will simply configure the data in objects, in an XML File :)
		
		// IOC Procedure
		// PreRequisite : Link Spring Core Jar Files | https://spring.io/ | https://mvnrepository.com/search?q=spring
		// 1. Create the Bean Structure
		// 2. Create the client class with main
		// 3. Copy xml file in src directoy 
		// 4. Configure details of bean i.e. object in xml file
		// 5. Use IOC Container to get the objects constructed for usage
		//    5.1 BeanFactory
		//    5.2 ApplicationContext
		
		// > IOC : BeanFactory
		/*Resource resource = new ClassPathResource("beans.xml"); // Parse XML file for us :)
		BeanFactory beanFactory = new XmlBeanFactory(resource); // Create IOC Container
		
		// getBean method on BeanFactory will create objects for us by reading data from XML file :)
		Connection con3 = (Connection)beanFactory.getBean("cRef1");
		Connection con4 = beanFactory.getBean("cRef2", Connection.class);
		
		System.out.println(con3);
		System.out.println(con4);*/
		
		// > IOC : ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// We didnt requested for reference of bean, but ApplicationContext has already created the Objects for us

		/*Connection con3 = (Connection)context.getBean("cRef1");
		Connection con4 = context.getBean("cRef2", Connection.class);
		
		System.out.println(">> ReRequesting access for cRef1");
		Connection con5 = (Connection)context.getBean("cRef1");
		
		System.out.println(con3 +" HashCode for con3: "+con3.hashCode());
		System.out.println(con4 +" HashCode for con4: "+con4.hashCode());
		System.out.println(con5 +" HashCode for con5: "+con5.hashCode());*/
		
		
		Connection con = (Connection)context.getBean("cRef1");
		System.out.println(con);
		
		
		// Closing Context shall destroy all objects
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close(); // Close the Application Context
		
	}

}
