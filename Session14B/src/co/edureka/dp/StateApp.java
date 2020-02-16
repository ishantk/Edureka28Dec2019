package co.edureka.dp;

interface State{
	String getState();
}

class Placed implements State{
	
	public String getState() {
		return "ORDER IS PLACED";
	}
}

class Shipped implements State{
	
	public String getState() {
		return "ORDER IS SHIPPED";
	}
}

class Delivered implements State{
	
	public String getState() {
		return "ORDER IS DELIVERED";
	}
}


class Order{
	
	State state; // Has-A Relationship

	public State printState() {
		return state;
	}

	public void changeState(State state) {
		System.out.println(">> Email Sent to Customer for "+state.getClass().getSimpleName());
		this.state = state;
	}
	
}

public class StateApp {

	public static void main(String[] args) {
		
		// We have 3 States :)
		State s1 = new Placed();
		State s2 = new Shipped();
		State s3 = new Delivered();
		
		// Assume Customer Placed an Order
		System.out.println(">> Customer Placed an Order");
		Order order = new Order();
		order.changeState(s1);
		System.out.println(">> State of Order is: "+order.printState().getState());
		
		
		System.out.println();
		System.out.println(">> Order Shipped by Logistics");
		order.changeState(s2);
		System.out.println(">> State of Order is: "+order.printState().getState());
		
		System.out.println();
		System.out.println(">> Order Delivered by Delivery Agent");
		order.changeState(s3);
		System.out.println(">> State of Order is: "+order.printState().getState());
	}

}
