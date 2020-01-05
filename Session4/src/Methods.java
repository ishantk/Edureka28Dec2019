// Methods or Functions or Procedures or Routines
/*
 	eqn:
 	y = 2*x + 1
 	f(x) = 2*x + 1
 	
 	eqn:
 	y = x - 0.4*x
 	f(x) = x - 0.4*x
 	
 	eqn:
 	y = x + a*x
 	f(x,a) = x + a*x
 	
 	In the world of mathematics a function solves a problem
 	So, does in programming as well
 	
 */

public class Methods {
	
	// A function is always written in the class
	// It has a block
	// in the block we write what a function must do
	// Writing a function in class is called *definition* of function
	
	// int -> return type, i.e. the type of output
	// f1  -> name of function, can be any name of your choice and must be unique
	// int x -> represents input of type integer to function
	// return y -> if we execute the function it should give back the value of y as acknowledgement/result
	// return statement must be always the last statement
	
	// PS: Here we have created 4 functions, we can say we defined 4 functions i.e. what they will do when we will execute them
	int f1(int x) {
		int y = 2*x + 1;
		return y;
	}
	
	double f2(double x) {
		double y = x - 0.4*x;
		return y;
	}
	
	int f3(int x, int a) {
		int y = x + a*x;
		return y;
	}
	
	// void -> we will not return the results
	void addNumbers(int x, int y) {
		int sum = x + y;
		System.out.println(">> Addition of "+x+" and "+y+" is: "+sum);
		System.out.println(">> This is Awesome");
	}

	// Above are Non-Static Methods
	// In the Class, we can write a function which can be static
	// Below are Static Methods:
	static int squareOfNumber(int x) {
		int y = x*x; 
		return y;
	}
	
	// 				    2        3
	static int powerOfNum(int num, int power) {
		
		int result = 1;
		
		for(int i=1;i<=power;i++) {
			result = result * num;
		}
		
		return result;
	}

	// main is also a method
	// it has return type called void
	// it takes input as array of Strings. BUT, what are Strings -> Future Discussion
	public static void main(String[] args) {
		
		// In the main we will execute these functions
		// Since, A function is always written in the class
		// We will need an object of that class to execute the function
		
		// Object Construction Statement | NameOfClass RefNameOfYourChoice = new NameOfClass();
		Methods mRef = new Methods();   // Quite Similar to write an Array | int[] aRef = new int[5];
		// mRef is Reference to Object
		// What is Object -> Future Discussion

		// Function Execution where we will have nothing returned from function
		mRef.addNumbers(10, 20);
		mRef.addNumbers(11, 33);
		mRef.addNumbers(-10, -20);
		
		// Function Execution where we will get result in return
		int result1 = mRef.f1(10);
		System.out.println(">> Result1 by f1 is: "+result1);
		
		double result2 = mRef.f2(104.50);
		System.out.println(">> Result2 by f2 is: "+result2);
		
		System.out.println(">> Result from f3 is: "+mRef.f3(5, 2)); // whatever is being returned shall be directly printed
		
		// For static functions, we need not to have reference to the object
		// we can directly use class name and execute the same :)
		System.out.println(">> Square of 7 is: "+Methods.squareOfNumber(7));
		System.out.println(">> 2 raise to power 5 is: "+Methods.powerOfNum(2, 5));
		System.out.println(">> 3 raise to power 3 is: "+Methods.powerOfNum(3, 3));
	}

}
