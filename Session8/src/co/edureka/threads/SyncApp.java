package co.edureka.threads;

class MovieTicket{
	
	int seatNumber;
	int status;		// 0 -> available | 1 -> booked | 2 -> redeemed
	
	MovieTicket(int seatNumber) {
		this.seatNumber = seatNumber;
		status = 0;
	}
	
	// if a thread is using this method, a lock will be acquired and no other thread will be able to use it,
	// till current thread will not finish this method execution
	void purchaseMovieTicket(String email) {
	//synchronized void purchaseMovieTicket(String email) {
		if(status == 0) {
			System.out.println("-----Purchase Started ["+email+"]-------");
			System.out.println(">> Transacting Movie Ticket Payments");
			System.out.println("......");
			System.out.println(">> Payments Processed for ["+email+"]");
			status = 1; // lets change the status to booked
			System.out.println("-----Purchase Finished ["+email+"]-------");
			
			System.out.println();
			printMovieTicket(email);
			sendEmail(email);
			
		}else {
			System.out.println(">> Sorry ["+email+"] !! The Ticket is already booked !!");
		}
		
	}
	
	void printMovieTicket(String email) {
	//synchronized void printMovieTicket(String email) {
		System.out.println("-----Printing Ticket Started ["+email+"]-------");
		if(status==1) {
			System.out.println(">> Ticket Booked with Seat Number# "+seatNumber+" for ["+email+"]");
		}else {
			System.out.println(">> Sorry !! Ticket is not Booked Yet");
		}
		System.out.println("-----Printing Ticket Finished ["+email+"]-------");
		System.out.println();
	}
	
	void sendEmail(String email) {
		System.out.println(">> EMAIL Sent to "+email+" with Movie Ticket Seat# "+seatNumber);
		System.out.println();
	}
	
	// for n-number of methods in such a scenario we will have to make every method as synchronized.
	// What we can do is, to create a synchronized block in thread instead of synchornized methods
}

class BookTicketTask extends Thread{
	
	MovieTicket ticket; // Has-A Relationship | BookTicketTask Has Reference to MovieTicket Object
	String email;
	
	BookTicketTask(MovieTicket ticket, String email){
		this.ticket = ticket;
		this.email = email;
	}
	
	@Override
	public void run() {
		
		// We will lock the object directly. No other thread will be able to access the object referred by ticket reference variable
		// till time block has not finished its execution
		synchronized (ticket) {
			
			// In case of Non Prime Customer, let that customer wait :)
			// for john@example.com -> Thread will wait
			if(email.endsWith("(NP)")) {
				try {
					System.out.println(">> Ticket Held for ["+email+"]");
					ticket.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("=====Ticket Processing Started For ["+email+"]=====");
			ticket.purchaseMovieTicket(email);
			System.out.println("=====Ticket Processing Finished For ["+email+"]=====");
			
			ticket.notify(); 		// shall notify first waiting thread to resume its execution :)
			//ticket.notifyAll(); 	// Shall work for multiple threads who are waiting 
		}
	}
}

public class SyncApp {

	public static void main(String[] args) {
		
		// We have these 3 MovieTicket Objects available for Booking
		MovieTicket movieTicket1 = new MovieTicket(5);
		MovieTicket movieTicket2 = new MovieTicket(6);
		MovieTicket movieTicket3 = new MovieTicket(7);


		// Movie Ticket shall be Booked by BookTicketTask and not the main thread 
		// Both the users below are trying to book the same ticket
		// In a multi-threaded environment, multiple threads may try to access the same object
		BookTicketTask task1 = new BookTicketTask(movieTicket1, "john@example.com (NP)");
		BookTicketTask task2 = new BookTicketTask(movieTicket1, "fionna@example.com (P)");
		
		// Both the threads will run parallel
		task1.start();
		task2.start();
	}

}

// PS: We clearly can see that multiple threads working on the same object may cause a problem
//     They are not in sync i.e. they dont know the state of object changed by one in another :)
