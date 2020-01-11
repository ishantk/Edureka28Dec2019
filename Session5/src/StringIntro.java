
public class StringIntro {

	public static void main(String[] args) {
		 
		// character is just a letter to be stored in ''
		char ch = 'A';
		
		// word or sentence
		//char word = 'Awesome'; // error
		
		// We need String to store word or sentence, with S in UpperCase
		
		// Interned Way:
		// Both str1 and str2 points to the same Hello
		String str1 = "Hello";
		String str2 = "Hello";
		// We can compare interned strings with == operator
		// We can also use equals, contentEquals and compareTo
		
		// Object Way:
		// Both str3 and str4 points to the different Hello in different object
		String str3 = new String("HelLO");
		String str4 = new String("Hello");
		// But to compare object strings -> equals, contentEquals and compareTo
		
		// str1, str2, str3 and str4 are reference variables
		// reference variables will hold HashCodes :)
		
		// Let us print all the reference variables:
		// Printing Reference Variable should print HashCodes but below, content will be printed instead of HashCodes
		
		// without execution of toString()
		System.out.println(">> str1 is: "+str1);
		System.out.println(">> str2 is: "+str2);
		System.out.println(">> str3 is: "+str3);
		System.out.println(">> str4 is: "+str4);

		// with execution of toString() | toString is a method which belongs to String class here
		System.out.println(">> str1.toString() is: "+str1.toString());
		System.out.println(">> str2.toString() is: "+str2.toString());
		System.out.println(">> str3.toString() is: "+str3.toString());
		System.out.println(">> str4.toString() is: "+str4.toString());
		
		// PS: if we print reference variable of String, we will see the data i.e. the value instead of HashCode 
		//     because toString() will be executed automatically even if we will not execute it and shall return Value instead of HashCode

		// We are Comparing References and not data below:
		// Remember: Printing of Reference Variable shall execute toString and not in comparisons 
		if(str1 == str2) {	
			System.out.println(">> str1 == str2"); // A
		}else {
			System.out.println(">> str1 != str2");
		}
		
		if(str3 == str4) {
			System.out.println(">> str3 == str4"); 
		}else {
			System.out.println(">> str3 != str4"); // A
		}
		
		if(str1 == str3) {
			System.out.println(">> str1 == str3");
		}else {
			System.out.println(">> str1 != str3"); // A
		}
		
		// How to compare strings for their equality
		// Why we need it : to validate the user input at so many places
		
		if(str3.equals(str4)) {
			System.out.println(">> str3 equals str4");
		}else {
			System.out.println(">> str3 not equals str4");
		}
		
		if(str1.equals(str3)) {
			System.out.println(">> str1 equals str3");
		}else {
			System.out.println(">> str1 not equals str3");
		}
		
		if(str3.contentEquals(str4)) {
			System.out.println(">> str3 content Equals str4");
		}else {
			System.out.println(">> str3 not content Equals str4");
		}
		
		if(str3.compareTo(str4) == 0) {
			System.out.println(">> str3 compared to str4");
		}else {
			System.out.println(">> str3 not compared to str4");
		}
		
		// PS: Upper case Strings are different from lower case Strings
		// If we wish to ignore case and compare strings we got below to methods: 
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println(">> str3 equals ignore case str4");
		}else {
			System.out.println(">> str3 not equals ignore case str4");
		}
		
		if(str3.compareToIgnoreCase(str4) == 0) {
			System.out.println(">> str3 compared to ignore case str4");
		}else {
			System.out.println(">> str3 not compared to ignore case str4");
		}
		
	}

}
