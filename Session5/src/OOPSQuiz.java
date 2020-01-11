// Counter Object Representation
// attribute: count
class Counter{
	
	// non static : Property of object
	int count;
	static int sCount;
	
	// static : Property of Counter Class | We have only 1 Counter Class hence only 1 objectCount in it :)
	static int objectCount = 0;
	
	// Default Constructor
	Counter(){
		System.out.println(">> Counter Object Constructed");
		count = 1; 			// count attribute value goes 1, when we create object
		objectCount++;		// objectCount attribute of class increments, when we create object
		sCount = 0;
	}
	
	void increment() {
		count++;
		sCount++;
	}
	
	void decrement() {
		count--;
		sCount--;
	}
	
	void showCount() {
		System.out.println(">> count is: "+count+" and sCount is: "+sCount);
	}
	
	static void showObjectCount() {
		System.out.println(">> Object Count: ["+objectCount+"]");
	}
}


public class OOPSQuiz {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();	// Object Construction Statement
		Counter c2 = new Counter(); // Object Construction Statement
		Counter c3 = c1;			// Reference Copy
		
		// How many Counter Objects did we create : 2
		c1.increment();	// c1/c3: 2
		c2.increment(); // c2: 2
		c3.increment(); // c1/c3: 3
		
		c1.increment(); // c1/c3: 4
		c2.increment(); // c2: 3
		c3.decrement(); // c1/c3: 3
		
		c1.decrement(); // c1/c3: 2
		
		c2.decrement(); // c2: 2
		c1.increment(); // c1/c3: 3 
		
		c1.showCount(); // >> count is: 3 and sCount is: ?
		c2.showCount(); // >> count is: 2 and sCount is: ?
		c3.showCount(); // >> count is: 3 and sCount is: ?
		
		Counter.showObjectCount();
	}

	// PS: static means it will remain in the memory till time your program is running
}
