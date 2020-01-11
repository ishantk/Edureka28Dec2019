/*
 	OOPS in Real World:
 
 	Object: Anything which exists in reality is an Object
 			Real time entity
 			examples: chair, car, mobile phone, laptop etc..
 	Class : Representation of Object
 			Drawing Representing Object
 			
 	What comes in your mind first : Object or Class ?
 	It should be Object
 			
 	Principle of OOPS	
 	1. Think of Object
 	2. Create its Drawing
 	3. From Drawing create a Real Object
 	
 	OOPS in Computer Science:
 	Object : Multi Value Container which will store data 
 			 May be homo or hetro as per requirements
 			 it will be created in the heap area of ram
 			 
 	Class  : Representation of how object will look like in the memory
 			 what object will have in it as a container
 			 
 	Principle of OOPS	
 	1. Think of Object
 	   1.1 Study software development requirements from client and identify objects
 	   1.2 Anything which will have lot of data associated with it, is known as object
 	   1.3 Associated data to Object are attributes of object
 	   
 	   example : We need to create a Food Delivery App like Zomato
 	   			 In Zomato we see a list of restaurants clicking on it dishes will open
 	   			 now customer can add dishes into cart and place an order
 	   			 order shall be received and confirmed by restaurant and delivery agent shall deliver the food
 	   			 
 	   			 Restaurant : name, description, phone, ratings, pricePerPerson, timeToDeliver
 	   			 Restaurant is an Object
 	   			 name, description, phone, ratings, pricePerPerson, timeToDeliver are attributes
 	   
 	2. Create its Drawing
 		We need to code and create a class that shall represent an Object
 		We say Drawing is Textual Representation of an Object here !!
 		
 	3. From Drawing create a Real Object
 	   In the main method we will write Object Construction Statement

 */


// 1. Think of an Object
// Restaurant is an Object
// name, description, phone, ratings, pricePerPerson, timeToDeliver are attributes
// We must try to write as many as attributes possible so as to have better solution to the problem in future

// 2. Create its Drawing i.e. Textual Representation of Object
class Restaurant{
	
	// Attributes : Belongs to Object and not to class
	String name;
	String description;
	String phone;
	double ratings;
	int pricePerPerson;
	int timeToDeliver;
	
	// Constructor:
	// a method with no return type and name same as that of class name
	// shall be executed automatically when we create object
	// its the first thing which will be executed on object after it gets constructed in memory
	// if we will not create it, compiler will create it and add it to our class with some default values.
	
	// Property of Object and not of class
	// Default Constructor | No-Arg Constructor
	Restaurant(){
		System.out.println(">> Restaurant Object Constructed");
		name = "NA";
		description = "NA";
		phone = "NA";
		ratings = 3.0;
		pricePerPerson = 100;
		timeToDeliver = 10;
	}
	
	// Overloaded Constructor : With Inputs
	// Parameterized Constructor
	Restaurant(String name, String description, String phone, double ratings, int pricePerPerson, int timeToDeliver){
		System.out.println(">> Restaurant Object Constructed with Inputs");
		// LHS is Attribute of Object and RHS is input to constructor
		// They are same
		
		// this.name on LHS is property of Object whereas RHS name is input to constructor
		// this is used to distinguish what belongs to object and what to constructor/method input
		this.name = name;
		this.description = description;
		this.phone = phone;
		this.ratings = ratings;
		this.pricePerPerson = pricePerPerson;
		this.timeToDeliver = timeToDeliver;
	}
	
	// Method : Property of Object and not of Class
	void setRestaurantDetails(String name, String description, String phone, double ratings, int pricePerPerson, int timeToDeliver){
		System.out.println(">> Restaurant Object Constructed with Inputs");
		// LHS is Attribute of Object and RHS is input to constructor
		// They are same
		
		// this.name on LHS is property of Object whereas RHS name is input to constructor
		// this is used to distinguish what belongs to object and what to constructor/method input
		this.name = name;
		this.description = description;
		this.phone = phone;
		this.ratings = ratings;
		this.pricePerPerson = pricePerPerson;
		this.timeToDeliver = timeToDeliver;
	}
	
	void showRestaurantDetails() {
		System.out.println("------------------------------------------");
		System.out.println(name+" \t "+ratings);
		System.out.println(description);
		System.out.println(phone);
		System.out.println(pricePerPerson+"price per person \t "+timeToDeliver+" minutes to deliver");
		System.out.println("------------------------------------------");
	}
	
}

public class OOPS {

	public static void main(String[] args) {
		
	 	// 3. From Drawing create a Real Object
		// Object Construction Statement
		Restaurant r1 = new Restaurant(); // Restaurant(); -> Execution of Constructor
		Restaurant r2 = new Restaurant();
		Restaurant r3 = r1; // Reference Copy
		
		// With Default Constructor
		//Restaurant r4 = new Restaurant();
		
		// With Parameterized Constructor | We write the data at the time of object construction
		Restaurant r4 = new Restaurant("Shakiti Om Veg", "North Indian, Sweets", "+91 99990 00009", 4.0, 250, 45);
		
		// r1 r2, r3, r4 are not Objects, they are reference variables holding HashCode of Object
		// r1 r2, r3, r4 will be in Stack whereas Restaurant Object with mentioned attributes in class shall be in Heap

		// Print Reference Variables r1 and r2
		// r3 and r1 are different references but pointing to the same object
		// we will have only 2 objects in the memory
		System.out.println(">> r1 is: "+r1);
		System.out.println(">> r2 is: "+r2);
		System.out.println(">> r3 is: "+r3);
		System.out.println(">> r4 is: "+r4);
		
		// new is an operator which will create the object in memory in the RAM Area's heap structure
		// Restaurant Object will be created at run time i.e. when program will execute i.e. dynamically

		// By default object created has no data
		
		// Object Operations
		// 1. Write Data in Object :)
		//r1.name = "Bikanervala";
		//r3.description = "Mithai, North Indian, South Indian, Chinese";
		//r1.phone = "+91 99999 88888";
		//r3.ratings = 4.0;
		//r1.pricePerPerson = 200;
		//r1.timeToDeliver = 40;
		
		r1.setRestaurantDetails("Bikanervala", "Mithai, North Indian, South Indian, Chinese", "+91 99999 88888", 4.0, 200, 40);
		
		r2.name = "Pandit Ji De Paranthe";
		r2.description = "North Indian, Biryani, Chinese, Desserts";
		r2.phone = "+91 90909 80808";
		r2.ratings = 4.4;
		r2.pricePerPerson = 200;
		r2.timeToDeliver = 39;
		
		// We have written data in 2 of the objects.
		
		// 2. Read Data from Object :)
		//System.out.println(">> "+r1.name+" has ratings: "+r1.ratings+" and can deliver in "+r1.timeToDeliver+" minutes");
		//System.out.println(">> "+r3.name+" has ratings: "+r3.ratings+" and can deliver in "+r3.timeToDeliver+" minutes");
		
		//System.out.println(">> "+r2.name+" has ratings: "+r2.ratings+" and can deliver in "+r2.timeToDeliver+" minutes");
		//System.out.println(">> "+r4.name+" has ratings: "+r4.ratings+" and can deliver in "+r4.timeToDeliver+" minutes");
	
		r1.showRestaurantDetails();
		r2.showRestaurantDetails();
		r3.showRestaurantDetails();
		r4.showRestaurantDetails();
		
		System.out.println(">> AFTER UPDATE");
		
		// 3. Update Data in Object :)
		//    change value for attribute and data updated
		r1.phone = "+91 99999 00000";
		r1.ratings = 4.2;
		r1.timeToDeliver = 15;
		System.out.println(">> "+r1.name+" has ratings: "+r1.ratings+" and can deliver in "+r1.timeToDeliver+" minutes");
		
		// 4. Delete Object
		// This happens automatically for us by Garbage Collector in JVM.
		// System.gc(); // Forcefully executing GC
		
		// Challenges:
		// 1. If we create object and do not write data in it, it must have some default values as per our requirements
		//    Create Constructor
		// 2. If we create n number of Restaurant objects, to write data in 6 attributes we will write 6 lines of code
		//    Create Method
		// 3. If we need to change our print statement, we have to change every print statement
		//    Create Method
		
		// Object other than attributes, can have constructors and methods
	}

}
