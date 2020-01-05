
public class MethodExecution {
	
	// static can be accessed by class name
	// hence, we will need no object construction
	// object construction required for non static functions
	static void square(int a, int b) {
		
		System.out.println(">> a before is: "+a);
		System.out.println(">> b before is: "+b);
		
		// modify a and b value
		// computation and update in container
		a = a*a;
		b = b*b;
		
		System.out.println(">> a after is: "+a);
		System.out.println(">> b after is: "+b);
	} // Termination of Method:square

	// main is a method
	// this is executed on the very fist
	public static void main(String[] args) {
		
		// All the statements written below belongs to main
		
		// Creation Statements
		int x = 10;
		int y = 20;
		
		// Read/Print Statements
		System.out.println(">> x is: "+x);
		System.out.println(">> y is: "+y);
		
		MethodExecution.square(x, y);			// below statements will not be executed till time above method finishes its execution
		
		System.out.println(">> main finished");

	}// Termination of Method:main

}
