package co.edureka.exception;

public class App {

	// Whatever we write in main is executed in a sequence
	// i.e. one after another
	// When we execute our program -> In the Process -> main method represents main thread
	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		int[] array = {10, 20, 30, 40, 50};
		int a=10,b=3,c=0;
		//System.out.println(">> array[3] is: "+array[3]);
		// The Below Line will end up in generating error at run time and our program will CRASH :(
		try {
			// if error comes in try block, control directly goes to catch
			// And hence, statements below erroneous statements in try block will not be executed
			System.out.println(">> array[30] is: "+array[30]); // 30 is not an index available in array
			c = a/b;
			 
		}/*catch(ArrayIndexOutOfBoundsException aRef) {
			System.out.println(">> SOME ERROR: "+aRef); // aRef toString will be executed to show the error message
			//aRef.printStackTrace(); // It will give us the line number as well
		}catch(ArithmeticException aRef) {
			System.out.println(">> SOME ERROR: "+aRef);
		}*/
		catch(Exception e) { // RTP Example
			//System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}finally { // which is executed whether exception is handled or not
			System.out.println(">> Must be executed");
		}
		
		System.out.println(">> c is: "+c);
		
		System.out.println(">> Work Hard, Get Luckier");
		
		System.out.println(">> App Finished");

	}

}

// PS: Wherever you get error in main at run time, program simply terminates from that point i.e. line :)
//     Having such crashes in program will degrade performance of JVM as well
//     So, we must try to handle such scenarios | try, catch, finally, throw and throws
//     Error Generated at Run Time -> EXCEPTION

/*
 	
 	// TC
 	try{
 	
 	}catch(){
 	
 	}
 	
 	// T *C
 	try{
 	
 	}catch(){
 	
 	}catch(){
 	
 	}
 	
 	// TCF
 	try{
 	
 	}catch(){
 	
 	}finally{
 	
 	}
 	
 	// Nested
 	try{
 		try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}catch(){
 		try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}finally{
 	 	try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}
 	
 	// Try Alone is Error
 	try{
 	
 	}
 	
 	// catch Alone is Error
 	catch(){
 	
 	}
 	
 	// finally Alone is Error	
 	finally{
 	
 	}
 	
 	
 	// We can have try with finally if we wish to skip catch
 	// We will be able to execute something before program crashes
 	try{
 	
 	}finally{
 	
 	}
 	
 	
 */

