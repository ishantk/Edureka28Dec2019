/*class Payment{
	
	Payment(){
		System.out.println(">> Payment Object Constructed");
	}
	
	void pay(int amount) {
		System.out.println(">> Payment for \u20b9"+amount+" Processed !!");
	}
}*/

// Optimize RTP on Programming End
// PS: abstract class: For which we cannot create Objects, BUT JVM can for Inheritance
/*
abstract class Payment{
	
	Payment(){
		System.out.println(">> Payment Object Constructed");
	}
	
	// abstract method : can only be created in abstract class
	//					 acts as a rule/protocol created by Parent Object
	//					 must be defined by all the children which are associated to Payment
	abstract void pay(int amount);
	
	void show(){
		System.out.println(">> This is show");
	}
}
*/

// Let us optimize memory space
interface Payment{
	
	// Err : interfaces cannot have constructors
	//       This means : Neither we nor JVM can create object of interface
	//		 Hence, Interfaces can never ever have objects i.e. they cannot the instantiated by us or JVM.
	//		 Finally, Interfaces cannot be inherited :(
	//       So we implement them as a RULE BOOK
	/*Payment(){
		System.out.println(">> Payment Object Constructed");
	}*/
	
	// by default methods are abstract
	// public abstract void pay(int amount);
	// acts as a rule/protocol created by an Interface
	// must be defined by all the objects/classes which are implements it
	void pay(int amount);
	
	// error:
	/*void show(){
		System.out.println(">> This is show");
	}*/
}

class NetBanking implements Payment{ //extends Payment{
	
	NetBanking(){
		System.out.println(">> NetBanking Object Constructed");
	}
	
	// defining pay method is mandatory now :)
	public void pay(int amount) {
		System.out.println(">> Payment for \u20b9"+amount+" Processed with Net Banking !!");
	}
}

class DebitCard implements Payment{ //extends Payment{
	
	DebitCard(){
		System.out.println(">> DebitCard Object Constructed");
	}
	
	public void pay(int amount) {
		System.out.println(">> Payment for \u20b9"+amount+" Processed with Debit Card !!");
	}
}

class PaytmWallet implements Payment{ //extends Payment{
	
	PaytmWallet(){
		System.out.println(">> PaytmWallet Object Constructed");
	}
	
	public void pay(int amount) {
		System.out.println(">> Payment for \u20b9"+amount+" Processed with Paytm Wallet !!");
	}
}


class ZomatoApp{
	
	
	void payForOrder(Payment payment, int amount) {
		payment.pay(amount);
	}
	
}

public class RTP {

	public static void main(String[] args) {
		
		// RTP:
		/*
		//Payment payment = new Payment();
		//payment.pay(2000);
		
		//NetBanking netBanking = new NetBanking();
		//netBanking.pay(2000);
		
		// Create Reference Variable of Parent i.e. Payment
		Payment payment; 
		// Parent's Reference Variable can point to the Object of Child
		// Payment's Reference Variable can point to the Object of NetBanking 
		payment = new NetBanking();	// Polymorphic Statement
		payment.pay(2000); // Child's Version | Overriding
		
		System.out.println();
		
		payment = new DebitCard();
		payment.pay(2000);
		
		System.out.println();
		
		payment = new PaytmWallet();
		payment.pay(2000);
		
		// RTP : Parent's Reference Variable can point to the Object of Child
		*/
		
		ZomatoApp app = new ZomatoApp();
		
		// Having Object of Payment will be a generalized Case. 
		// Executing pay on Payment Object will again be Generalized Case.
		// Both Payment Object and pay method will be of not use :(
		
		// Payment payment = new Payment();
		// payment ref variable pointing to the object of Payment itself will not be of any specific case. its a generalized case
		
		// Making Payment class as abstract , now we cannot create its Object
		// BUT, JVM to follow the principle of OOPS will create a Parent Object and than the Child Object
		// This is kind of now, waste in memory space
		
		// The statement below is a much more specific case
		Payment payment = new PaytmWallet();
		
		app.payForOrder(payment, 2000);
	}

}

// PS: If we create n-number of methods in abstract class or interfaces as rules, all of them must be defined by childrent or object/class implementing interface
