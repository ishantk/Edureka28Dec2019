
public class MutableStrings {

	public static void main(String[] args) {
		
		// IMMUTABLE | Manipulations : Waste Memory
		String string = new String("Hello");
		string.concat(" World"); // This will not change the string, rather a new String will have concatenated data
		
		System.out.println(">> string is: "+string); // Hello | No Modification in string
		
		// MUTABLE | Manipulations : Save Memory
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");  // This will change the buffer, existing string buffer will have concatenated data
		System.out.println(">> buffer is: "+buffer); // Hello World | Modification in buffer allowed
		
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");  // This will change the buffer, existing string buffer will have concatenated data
		System.out.println(">> builder is: "+builder); // Hello World | Modification in buffer allowed
		
		// StringBuffer and StringBuilder are both MUTABLE Strings and are used when we wish to perform manipulations
		// StringBuffer is THREAD-SAFE i.e. SYNCHRONIZED
		// StringBuilder is NOT THREAD-SAFE i.e. NOT SYNCHRONIZED
		
		// We cannot Use StringBuffer and StringBuilder as Interned Strings :)
		// StringBuffer buf = "Hello"; // err
		// StringBuilder bul = "Hello"; // err
		
	}

}
