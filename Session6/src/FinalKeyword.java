// final class cannot be inherited i.e extended
final class BookMyShow{
	
	// final method : which cannot be re-defined in child
	// cannot override this methid anymore
	final void processTicket() {
		System.out.println(">> BookMyShow Ticket Processing Done !!");
	}
}

//class MyShow extends BookMyShow{ // err
	
	/*void processTicket() { // err
		System.out.println(">> MyShow Ticket Processing Done !!");
	}*/
//}


public class FinalKeyword {

	public static void main(String[] args) {
		
		// variable : whose value can be modified
		// conatiner's data can be updated :)
		//int size = 10;
		
		// size can be modified due to any reason
		//size = 12;
		// Its a constant for us in Java
		final int size = 10;
		
		// final variable cannot be modified
		// if a storage container is marked as final, we cannot update it. It will be used as read only container
		//size = 12; // error
		
		// corresponding effect will come on array where we are using it 
		int[] arr = new int[size];
		
		
	}

}
