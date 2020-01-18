package co.edureka.one;

public class One {

	// within the class we can use 4 access modifiers for attributes and methods for both public or default class
	// private, default  or no access modifier, protected, public
	
	private void pvtShow() {
		System.out.println(">> This is private show of One");
	}
	
	void defShow() {
		System.out.println(">> This is default show of One");
	}
	
	protected void protShow() {
		System.out.println(">> This is protected show of One");
	}
	
	public void pubShow() {
		System.out.println(">> This is public show of One");
	}
	
}

// In 1 source file we cannot have more than 1 public class
// As rule says: your source file name should be same name as that of public class
/*public class Two{
	
}*/

// Allowed
// Default class as in we have not used any access modifier :)
class Two{
	
	private void pvtShow() {
		System.out.println(">> This is private show of Two");
	}
	
	void defShow() {
		System.out.println(">> This is default show of Two");
	}
	
	protected void protShow() {
		System.out.println(">> This is protected show of Two");
	}
	
	public void pubShow() {
		System.out.println(">> This is public show of Two");
	}
	
}


// private as class is not allowed
/*private class Three{
	
}*/

//protected as class is not allowed
/*protected class Four{
	
}*/


// PS: class can either be public or default
//     in case it is public then, name of source file must be same name as that of public class
