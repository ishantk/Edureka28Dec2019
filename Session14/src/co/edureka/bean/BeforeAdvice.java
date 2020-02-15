package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	// before method shall be executed BEFORE our Business Logic Method :)
	@Override
	public void before(Method method, Object[] inputs, Object refBean) throws Throwable {
		
		
		
		// 1. Check for the Product Stock | This task shall be done by before method :)
		if(method.getName().equals("purchaseProduct")) {
			
			System.out.println("------BEFORE ADVICE START--------");
			System.out.println(">> Stock Validation in Action");
			System.out.println("-----------------------------");
			
			// Get the Reference to Product Object Constructed by Spring FW
			Product product = (Product)refBean;
			if(product.stock > 0) {
				product.state = 1;	// 1 -> Product can be Sold
			}else {
				product.state = 0;  // 0 -> Product cannot be Sold
			}
			
			System.out.println("------BEFORE ADVICE FINISH--------");
			System.out.println();
		}
		
		
	}

}
