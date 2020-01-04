// Unicodes can be seen at : https://unicode-table.com/en/
public class ConditionalFlows {

	// main is a method which is executed when we run the program
	// whatever we write in main shall be executed in a seqeunce
	public static void main(String[] args) {
		
		/*
		double amount = 200;
		// On Food Ordering App we shall give a flat 40% off in case amount exceeds 1000
		
		// Regular if/else
		
		if(amount >= 1000) {
			//amount = amount - (0.4*amount);
			amount -= (0.4*amount); // -> amount = amount - (0.4*amount);
			System.out.println(">> A discount of 40% applied on your order");
			System.out.println(">> Please Pay: \u20b9"+amount);
		}else {
			System.out.println(">> Please add more products worth \u20b9"+(1000-amount)+" to get a discount of 40%");
			System.out.println(">> Please Pay: \u20b9"+amount);
		}
		*/
		
		// Use Case:
		// Give a discount of 20% for amount of >=200 <500
		// Give a discount of 30% for amount of >=500 <1000
		// Give a discount of 40% for amount of >=1000
		
		double amount = 1200;
		
		// Ladder if/else
		if(amount >= 200 && amount < 500) {
			amount -= (0.2*amount); // -> amount = amount - (0.4*amount);
			System.out.println(">> A discount of 20% applied on your order");
			System.out.println(">> Please Pay: \u20b9"+amount);
		}else if(amount >= 500 && amount < 1000) {
			amount -= (0.3*amount); // -> amount = amount - (0.4*amount);
			System.out.println(">> A discount of 30% applied on your order");
			System.out.println(">> Please Pay: \u20b9"+amount);
		}else if(amount >= 1000 ) {
			amount -= (0.4*amount); // -> amount = amount - (0.4*amount);
			System.out.println(">> A discount of 40% applied on your order");
			System.out.println(">> Please Pay: \u20b9"+amount);
		}else { // if nothing above is satisfied :(
			System.out.println(">> Please add more products worth \u20b9"+(200-amount)+" to get a discount from 20% upto 40%");
			System.out.println(">> Please Pay: \u20b9"+amount);
		}
		
		System.out.println();
		
		// We have 3 different segment of cabs
		int olaMicro = 1;
		int olaMini = 2;
		int olaSedan = 3;
		
		int baseFare = 50;
		
		int myChoiceOfCab = olaMini;
		
		/*
		if(myChoiceOfCab == olaMicro) {
			baseFare += 50;
			System.out.println(">> OLA Micro Booked: Please pay \u20b9"+baseFare);
		}else if(myChoiceOfCab == olaMini) {
			baseFare += 100;
			System.out.println(">> OLA Mini Booked: Please pay \u20b9"+baseFare);
		}else if(myChoiceOfCab == olaSedan) {
			baseFare += 150;
			System.out.println(">> OLA Sedan Booked: Please pay \u20b9"+baseFare);
		}else {
			System.out.println(">> Please Select Type of Cab to Proceed !!");
		}*/
		
		// In case we are implementing Ladder if/else we can also use switch case :)
		
		switch (myChoiceOfCab) {
			
			case 1:
				baseFare += 50;
				System.out.println(">> OLA Micro Booked: Please pay \u20b9"+baseFare);
				break; // Termination: come out of switch and do not execute below cases
				
			case 2:
				baseFare += 100;
				System.out.println(">> OLA Mini Booked: Please pay \u20b9"+baseFare);
				break; 
				
			case 3:
				baseFare += 150;
				System.out.println(">> OLA Sedan Booked: Please pay \u20b9"+baseFare);
				break;
	
			default:
				System.out.println(">> Please Select Type of Cab to Proceed !!");
				break;
		}
		
		
		System.out.println();
		
		// Nested if/else 
		// You have conditions to be tested within conditions
		
		// Turn on Data or turn Off Data in your Mobile devices
		boolean data = true; // internet is enabled
		boolean gps = false;
		
		
		if(data) {
			
			System.out.println(">> You can Use Google Maps");
			
			if(gps) {
				System.out.println(">> You can Navigate with Google Maps");
			}else {
				System.out.println(">> Please Enable GPS to Navigate and Try Again !!");
			}
			
		}else {
			System.out.println(">> Please Enable Internet and Try Again !!");
		}
		
	}

}
