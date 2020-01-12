interface Cab{
	// public static final int baseFare = 100;
	int baseFare = 100; //Property of Interface
	
	void bookCab(String source, String destination); // public abstract void bookCab(String source, String destination);
	void showDriverDetails();						 // public abstract void showDriverDetails();

}

interface TrafficRules{
	void registrationNumber();
}

// MULTIPLE INHERITANCE : Interfaces can inherit another interfaces but this is just inheriting rules and nothing like object to object
// Interface to Interface Inheritance
interface Rules extends Cab, TrafficRules{
	
}

// A Class can implement Multiple Interfaces.
// BUT, this is not Multiple Inheritance as Interfaces play no role in inheritance
// This is MULTIPLE IMPLEMENTATION :)
class UberGo implements Rules{//Cab, TrafficRules{
	
	public void bookCab(String source, String destination) {
		System.out.println(">> UberGo Booked from "+source+" to "+destination);
		System.out.println(">> Please Pay: \u20b9"+(Cab.baseFare+50));
	}
	
	public void showDriverDetails() {
		System.out.println(">> John is coming to Pick you Up. Please contact at +91 99999 88888");
	}

	public void registrationNumber() {
		System.out.println(">> Registration Details: [KA10AB1234]");
	}
}

class UberPremier implements Cab, TrafficRules{
	
	public void bookCab(String source, String destination) {
		System.out.println(">> UberPremier Booked from "+source+" to "+destination);
		System.out.println(">> Please Pay: \u20b9"+(Cab.baseFare+100));
	}
	
	public void showDriverDetails() {
		System.out.println(">> Fionna is coming to Pick you Up. Please contact at +91 98765 1321");
	}

	public void registrationNumber() {
		System.out.println(">> Registration Details: [KA12CB1212]");
	}
	
}


public class InterfacesReExplained {

	public static void main(String[] args) {
		
		/*
		Cab cab;
		TrafficRules rules;
		
		cab = new UberGo(); // Polymoprhic Statement
		cab.bookCab("Pristine Magnum", "Country Homes");
		cab.showDriverDetails();
		//cab.registrationNumber(); // error : Cab as interface has no rule called registrationNumber
		
		// Using the same object rather than creating a new Object
		// Same RTP with TrafficRules on the same object pointed by cab
		// rules = new UberGo(); // Polymoprhic Statement | New Object
		rules = (UberGo)cab;	 // DownCasting :)
		rules.registrationNumber();
		
		System.out.println();
		
		cab = new UberPremier();
		cab.bookCab("Pristine Magnum", "Country Homes");
		cab.showDriverDetails();
		
		rules = (UberPremier)cab;
		rules.registrationNumber();
		*/
		
		Rules rules = new UberGo();
		rules.bookCab("Pristine Magnum", "Country Homes");
		rules.showDriverDetails();
		rules.registrationNumber();
	}

}
