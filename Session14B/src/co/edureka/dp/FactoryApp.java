package co.edureka.dp;

interface Plan{
	String getDescription();
	int getPrice();
}

class Plan2G implements Plan{
	
	int data;
	int price;
	
	Plan2G(){
		data = 5; 	// 5GB of 2G data per month
		price = 200;
	}
	
	@Override
	public String getDescription() {
		String description = "Plan 2G shall Offer "+data+"GB of data in \u20b9"+price;
		return description;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
	
	
}

class Plan3G implements Plan{
	
	int data;
	int price;
	
	Plan3G(){
		data = 10; 	// 10GB of 3G data per month
		price = 300;
	}
	
	@Override
	public String getDescription() {
		String description = "Plan 3G shall Offer "+data+"GB of data in \u20b9"+price;
		return description;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
	
	
}

class Plan4G implements Plan{
	
	int data;
	int price;
	
	Plan4G(){
		data = 20; 	// 20GB of 4G data per month
		price = 500;
	}
	
	@Override
	public String getDescription() {
		String description = "Plan 2G shall Offer "+data+"GB of data in \u20b9"+price;
		return description;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
	
	
}

class PlanFactory{
	
	public static Plan getPlan(int type) {
		
		Plan plan = null;
		
		switch (type) {
			case 2:
				plan = new Plan2G();
				break;
				
			case 3:
				plan = new Plan3G();
				break;
				
			case 4:
				plan = new Plan4G();
				break;
				
			default:
				plan = new Plan3G();
				break;	

		}
		
		return plan;
	}
	
}

public class FactoryApp {

	public static void main(String[] args) {
		

		Plan plan = PlanFactory.getPlan(4);
		System.out.println(plan.getDescription());
		System.out.println(plan.getPrice());
		
	}

}
