package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	// afterReturning method shall be executed AFTER our Business Logic Method :)
	@Override
	public void afterReturning(Object arg0, Method method, Object[] inputs, Object refBean) throws Throwable {
		

		
		// 1. Check for the Product Stock | This task shall be done by before method :)
		if(method.getName().equals("purchaseProduct")) {
			
			System.out.println("------AFTER ADVICE START--------");
			System.out.println(">> Notifications in Action");
			System.out.println("-----------------------------");
			
			// Get the Reference to Product Object Constructed by Spring FW
			Product product = (Product)refBean;
			if(product.state == 1) {
				System.out.println(">> Email Sent Successfully !!");
				System.out.println(">> "+product.name+" will be delivered at "+inputs[0]+" by "+inputs[1]);
				System.out.println();
				System.out.println(">> Logistics Notified. Please Process the Shipment !!");
			}
			
			System.out.println("------AFTER ADVICE FINISH--------");
			System.out.println();
		}
		
		
		
	}

}
