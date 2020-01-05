// Compile Time Polymorphism
// Where compiler at the compile time knows which function execution statement will execute which defintion

// Early binding
// Since it is done at compile time: so we call it early biding

// Static Polymorphism
// As Compiler will do it at compile time

/*
 	Rules to Perform CTP
 	CTP is achieved by OVERLOADING the Function
 	
 	Overloading : Same Function Name but different inputs
 	1. Function Name must be same
 	2. Inputs must be unique
 		2.1 number of inputs
 		2.2 type of inputs
 		2.3 sequence of inputs
 	3. Return type has no role to play
 */

public class Polymorphism {

	// Functions can be static or non static, its upto you :)
	
	// We have used the same function name
	// kept different inputs in all the functions
	// so that they become unique and different from each other
	// Compiler will know every function by its inputs i.e. signature -> [ add(int num1, int num2) ]
	// Compiler can very easily link the execution statements with definitions
	
	void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(">> sum of 2 numbers is: "+sum);
	}
	
	// 2.1 number of inputs
	void add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println(">> sum of 3 numbers is: "+sum);
	}
	
	// 2.2 type of inputs
	void add(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println(">> sum of 2 decimal numbers is: "+sum);
	}
	
	// 2.3 sequence of inputs
	void add(int num1, double num2) {
		double sum = num1 + num2;
		System.out.println(">> sum of 1 integer and 1 decimal number is: "+sum);
	}
	
	void add(double num1, int num2) {
		double sum = num1 + num2;
		System.out.println(">> sum of 1 decimal and 1 integer number is: "+sum);
	}
	
	public static void main(String[] args) {

		// Compiler can very easily link the execution statements with definitions
		Polymorphism pRef = new Polymorphism();
		
		// Same function name i.e. for user, same function can do multiple jobs :)
		pRef.add(10, 20);
		pRef.add(10, 20, 30);
		pRef.add(2.2, 3.3);
		pRef.add(10, 2.2);
		pRef.add(3.3, 12);
	}

}
