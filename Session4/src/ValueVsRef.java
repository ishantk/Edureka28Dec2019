
public class ValueVsRef {

	// if a method is static we don't need objects to execute them
	// we are not writing extra code to create object in memory and than executing the functions with its reference
	static void squareOfNumber(int number) { // Passing the Value
		number = number * number;
		System.out.println(">> [squareOfNumber] number is: "+number);
	}
	
	// array in the input is a reference variable which will hold the HashCode
	static void squareOfNumbers(int[] array) { // Passing the Reference
		
		System.out.println(">> [squareOfNumbers] array is: "+array);
		
		for(int i=0;i<array.length;i++) {
			array[i] = array[i] * array[i]; // We are squaring every index in the array
		}
		
	}
	
	public static void main(String[] args) {
	
		// Creation Statements
		int number = 10;
		int[] numbers = {10, 20, 30, 40, 50};
		
		System.out.println(">> [main] number is "+number);	 // Value		: 10
		System.out.println(">> [main] numbers is "+numbers); // HashCode	: 7852e922
		
		ValueVsRef.squareOfNumber(number); // Calling/Execution of Method with Value
		
		System.out.println(">> [main] number after execution of squareOfNumber method is "+number);
		
		ValueVsRef.squareOfNumbers(numbers); // Calling/Execution of Method with Reference (Having HashCode)
		
		System.out.println(">> After squareOfNumbers execution: ");
		
		for(int num : numbers) {
			System.out.println(">> "+num);
		}

	}

}
