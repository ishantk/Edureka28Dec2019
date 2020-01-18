package co.edureka.exception;

import java.io.IOException; // imported from a built in java.io package

// UNCHECKED -> MyBankingException IS CHILD OF RuntimeException
class MyBankingException extends RuntimeException{
	public MyBankingException(String message) {
		super(message);
	}
}

// CHECKED -> YourBankingException IS CHILD OF Exception
class YourBankingException extends Exception{
	public YourBankingException(String message) {
		super(message);
	}
}

class BankAccount{
	
	int balance = 10000;
	int minBalance = 2000;
	
	int attempts = 0;
	
	// throws keyword can be used in method signature to tell the execution call that this method will throw an exception which is checked
	void withdraw(int amount) throws IOException, YourBankingException{
		balance -= amount;
		
		if(balance < minBalance) {
			balance += amount;
			System.out.println(">> Withdraw Failed. Balance is LOW: Rs."+balance);
			attempts++;
		}else {
			System.out.println(">> Withdraw Success. New Balance is: Rs."+balance);
		}
		
		// For 3 UnSuccessful Attempts
		if(attempts == 3) {
			// We did'nt get any error by compiler to create this Exception and throw it
			// Compiler is not generating any sort of error messages for below operation
			
			//ArithmeticException aRef = new ArithmeticException("Balance is LOW. Invalid Attempts ["+attempts+"]");
			//throw aRef; // We created an Exception Object and we ourselves is now crashing the program :)
			
			// Now Let us Try throwing some another Exception
			// Here it works the same way as it worked above
			//IllegalStateException iRef = new IllegalStateException("Balance is LOW. Invalid Attempts ["+attempts+"]");
			//throw iRef;
			
			// Now Let us Try throwing some another Exception
			// Compiler is generating some error message for below operation
			//IOException iRef = new IOException("Balance is LOW. Invalid Attempts ["+attempts+"]");
			//throw iRef;
			
			// PS: For Some Exceptions compiler may keep a check
			//     If we are throwing those exception or we are using some methods which may throw that Exception, compiler will generate error
			//     Such Exceptions are known as CHECKED EXCEPTIONS
			
			//  ArithmeticException and IllegalStateException -> UNCHECKED EXCEPTION
			//  IOException 								  -> CHECKED EXCEPTION
			
			// RuntimeException and its Children -> UNCHECKED EXCEPTION
			// Rest all Exception Classes        -> CHECKED EXCEPTION
			
			// Exception class is parent of all the Exceptions in Java  :)
			
			// Custom/User-Defined UNCHECKED EXCEPTION
			//MyBankingException mRef = new MyBankingException("Balance is LOW. Invalid Attempts ["+attempts+"]");
			//throw mRef;
			
			YourBankingException yRef = new YourBankingException("Balance is LOW. Invalid Attempts ["+attempts+"]");
			throw yRef; // will be checked by compiler and must use throws in signature
		}
	}
}

public class ThrowThrows {

	public static void main(String[] args) {
		
		System.out.println(">> Banking Started");
		
		BankAccount account = new BankAccount();
		
		// if we will attempt for n number of times, what could be the challenge ?
		// We are wasting Bank's Resources :(
		
		try {
			for(int i=1;i<=500;i++) {
				account.withdraw(3000);
			}
		}catch(Exception eRef) { // eRef is ref var of Parent which can point to any child object | RTP
			System.out.println(">> Banking Exception: "+eRef);
		}
		
		System.out.println(">> Banking Finished");

	}

}
