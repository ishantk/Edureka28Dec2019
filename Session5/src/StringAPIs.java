
public class StringAPIs {

	public static void main(String[] args) {
		
		// Exploring built in methods of String
		// API's i.e. Application Programming Interfaces
		
		
		String fname = "John";
		String lname = "Watson";
		//String fullName = fname+" "+lname; // Concatenation Operation
		String fullName = fname.concat(" ").concat(lname);
		
		System.out.println(">> Full Name is: "+fullName); // John Watson
		
		
		// Strings are IMMUTABLE : They cannot be changed i.e. manipulated
		// If we try to perform any manipulation on String, it will create a new String in the memory
		String upperCaseName = fullName.toUpperCase();
		System.out.println(">> fullName is: "+fullName); // John Watson
		System.out.println(">> upperCaseName is: "+upperCaseName); // JOHN WATSON
		
				      //0123..........			   27
		String names = "John, Jennie, Jim, Jack, Joe";
		
		int idx = names.indexOf('o');
		System.out.println(">> idx is: "+idx); // 1
		
		int length = names.length();
		System.out.println(">> Length is: "+length); // 28 -> indexing: 0 to 27 characters
		
		idx = names.lastIndexOf('o');
		System.out.println(">> idx now is: "+idx); // 26
		
		char c = names.charAt(0);
		System.out.println(">> c is: "+c);     // J
		c = names.charAt(length-1);
		System.out.println(">> c now is: "+c); // e
		
		// We can convert the String into array of characters
		char[] arr = names.toCharArray();
		for(char chr : arr) {
			System.out.print(chr+" ");
		}
		System.out.println();
		
		// SubString
		//String subName = names.substring(6);  // Will give us a string from a string | from 6 till end
		String subName = names.substring(6, 10);// Will give us a string from a string | from 6 till 9
		System.out.println(">> subName is: "+subName);
		
		System.out.println();
		
		// Split the String into sub strings on the basis of a Pattern
		String[] separateNames = names.split(",");
		for(String str : separateNames) {
			System.out.println(str.trim()); // trim eliminates spaces from front and end
		}
		
		System.out.println();
		String replacedNames = names.replace('J', 'K');
		
		System.out.println(">> names: "+names);
		System.out.println(">> replacedNames: "+replacedNames);

		System.out.println();
		
		String email = "johnexample.com";
		if(email.contains("@") && email.contains(".")) {
			System.out.println(">> "+email+" OK");
		}else {
			System.out.println(">> "+email+" NOT OK");
		}
		
		String fileName = "hello.pdf";
		
		if(fileName.endsWith(".mp3")) {	 // similarly we have startsWith
			System.out.println(">> "+fileName+" is a music file");
		}else if(fileName.endsWith(".pdf")) {
			System.out.println(">> "+fileName+" is a document");
		}else {
			System.out.println(">> Unknown File Format");
		}
		
		int num = 100;
		String strNum = String.valueOf(num); // Convert any type to String -> valueOf
		
		// Explore more of them
		
	}

}
