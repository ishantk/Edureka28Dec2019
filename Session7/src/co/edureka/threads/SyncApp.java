package co.edureka.threads;

class MovieTicket{
	
	int seatNumber;
	
	MovieTicket(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	void printBookedTicket(String email) {
		System.out.println(">> Ticket Booked with Seat Number# "+seatNumber+" for ["+email+"]");
	}
}

class BookTicketTask extends Thread{
	
	MovieTicket ticket; // Has-A Relationship
	String email;
	
	BookTicketTask(MovieTicket ticket, String email){
		this.ticket = ticket;
		this.email = email;
	}
	
	@Override
	public void run() {
		System.out.println(">> Status for User ["+email+"]");
		System.out.println(">> Ticket Payment Transacted ["+email+"]");
		ticket.printBookedTicket(email);
	}
}

public class SyncApp {

	public static void main(String[] args) {
		
		MovieTicket movieTicket1 = new MovieTicket(5);
		MovieTicket movieTicket2 = new MovieTicket(6);
		MovieTicket movieTicket3 = new MovieTicket(7);


		// Movie Ticket shall be Booked by BookTicketTask and not the main thread 
		// Both the users below are trying to book the same ticket
		// In a multi-threaded environment, multiple threads may try to access the same object
		BookTicketTask task1 = new BookTicketTask(movieTicket1, "john@example.com");
		BookTicketTask task2 = new BookTicketTask(movieTicket1, "fionna@example.com");
		
		// Both the thread will run parllely
		task1.start();
		task2.start();
		
		//System.out.println(">> This is Print Statement");
		//System.err.println(">> This is Error Statement");
		

	}

}

// PS: We clearly can see that multiple threads working on the same object may cause a problem
//     They are not in sync i.e. they dont know the state of object changed by one in another :)
