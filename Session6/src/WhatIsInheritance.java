class Parent{
	
	String fname;
	String lname;
	int wealth;
	String vehicle;
	
	Parent(){
		System.out.println(">> Parent Object Constructed");
		fname = "John";
		lname = "Watson";
		wealth = 100000;
		vehicle = "Swift[4W][KA12AB5555]";
	}
	
	void showDetails() {
		System.out.println("==Parent Object Details==");
		System.out.println(">> NAME: "+fname+" "+lname);
		System.out.println(">> WEALTH: "+wealth);
		System.out.println(">> VEHCILE: "+vehicle);
		System.out.println("=========================");
	}
	
}

// class is representation of object. Whatever we write in non static form -> property of object
// extends is a keyword for Inheritance. 
// Inheritance : Relationship Creation between 2 classes as Parent and Child
class Child extends Parent{
	
	String fname;
	String vehicle;
	String companyName;
	
	Child(){
		System.out.println(">> Child Object Constructed");
		fname = "Fionna";
		vehicle = "Honda City[4W][KA22XY1111]";
		companyName = "ABC Tech";
	}
	
	/*void show(){
		System.out.println("==Child Object Details==");
		System.out.println(">> NAME: "+fname+" "+lname); // access lname from Parent
		System.out.println(">> WEALTH: "+wealth);		  // access wealth from Parent
		System.out.println(">> VEHCILE: "+vehicle);
		System.out.println(">> COMPANY: "+companyName);
		System.out.println("=========================");
	}*/
	
	// Let the function name be same as that of Parent object
	// OVERRIDING :)
	void showDetails(){
		
		super.showDetails(); // Since Parent and Child has the same method name. We can use super to distinguish !!
		
		System.out.println("==Child Object Details==");
		System.out.println(">> NAME: "+fname+" "+lname); // access lname from Parent
		System.out.println(">> WEALTH: "+wealth);		  // access wealth from Parent
		System.out.println(">> VEHCILE: "+vehicle);
		System.out.println(">> COMPANY: "+companyName);
		System.out.println("=========================");
	}
	
}


public class WhatIsInheritance {

	public static void main(String[] args) {
		
		//Parent pRef = new Parent(); // The Moment Object is constructed, Constructor will be executed :)
		//pRef.showDetails();			// Execution of showDetails method in Parent Object
		
		// Let's Create object of Child instead of Parent
		Child cRef = new Child();
		
		// RULE OF INHERITANCE
		// 1. Before Object of Child, Object of Parent is constructed in the memory :)
		// 2. Whatever belongs to Parent is accessible by Child. Attributes and Methods will belong to the Parent Object only.
		//    example: Father has a Car, Son does not own it. But if he wish he can use the car.
		
		// showDetails method does not belong to Child, but since, its parent has it, child can access it :)
		cRef.wealth = 120000; // Since, child does not have its attribute wealth, it will modify in Parent Object
		
		// if showDetails is not in the Child Object and available in Parent Object, it will execute the Parent's Version
		// But in cans it is also available in the Child Object, than Child's Version will be executed and not of Parent
		// OVERRIDING :)
		cRef.showDetails();	
		
		//cRef.show();

	}

}

/*
 	
 	Types of Inheritance
 	1. Single Level
 	CA
 	|
 	CB
 	
 	class CA{
 	
 	}
 	
 	class CB extends CA{
 	
 	}
 	
 	
 	2. Multi Level
  	CA
 	|
 	CB
 	|
 	CC
 	
 	class CA{
 	
 	}
 	
 	class CB extends CA{
 	
 	}
 	
 	class CC extends CB{
 	
 	}
 	
 	3. Hierarchy
 	   CA
 	   |
 	CB CC CD
 	
 	class CA{
 	
 	}
 	
 	class CB extends CA{
 	
 	}
 	
 	class CC extends CA{
 	
 	}
 	
 	class CD extends CA{
 	
 	}
 	
 	4. Multiple Inheritance : NOT SUPPORTED IN JAVA
 	CA   CB
 	   |
 	   CC
 	   
 	 class CA{
 	 	int x;
 	 	void show(){}
 	 }
 	 
 	 class CB{
 	 	int x;
 	 	void show(){}
 	 }
 	 
 	 class CC extends CA, CB{
 	 	// For CC to access x and show is a confusion :(
 	 }
 	 
 	 PS: We cannot have 2 Parents due to an ambiguity what if both Parent's has same attribute or method
 	 
 	 5. Hybrid
 	 Combination of any above
 	   
 */
