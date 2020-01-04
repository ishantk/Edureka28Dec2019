
public class Iterations {

	public static void main(String[] args) {
		
		// Different Type of Loops:
		// 1. while
		// 2. do while
		// 3. for
		// 4. enhanced for [for-each]

		// When to use a Loop
		// Where we need to do a task repeatedly
		// eg: to take print-outs from a printer, lets say 10 copies..
		//     we will not give print command 10 times. we just mention the number and it will do the job automatically
		
		// We have so many restaurants listed in Zomato/Swiggy or any food ordering app
		// All of them are displayed as a list... this is a kind of repeated job..
		// List of Contacts in Contacts App or WhatsApp
		// List of Products on Amazon
		
		int[] productPrices = {1200, 3450, 1001, 5678, 9000};
		double[] productRatings = {3.5, 4.5, 2.0, 1.7, 5.0};
		
		/*
		int srNo = 1;
		
		// Challenge1 : We have to write the same statement again and again
		// Challenge2 : For any change we need to rework in all the statements
		// Challenge3 : For any computation we need to do it again and again
		
		System.out.println(srNo+" | \u20b9"+productPrices[0]+" | "+productRatings[0]);
		srNo++;
		System.out.println(srNo+" | \u20b9"+productPrices[1]+" | "+productRatings[1]);
		srNo++;
		System.out.println(srNo+" | \u20b9"+productPrices[2]+" | "+productRatings[2]);
		srNo++;
		System.out.println(srNo+" | \u20b9"+productPrices[3]+" | "+productRatings[3]);
		srNo++;
		System.out.println(srNo+" | \u20b9"+productPrices[4]+" | "+productRatings[4]);
		*/
		
		// looking above use case rescue or solution is loops
		System.out.println(">> WHILE LOOP");
		// Check Condition First,  Do Job Later
		int srNo = 1;
		int idx = 0;
		// Keep on running the statements till condition is fulfilled. And when condition is not fulfilled, terminate the loop.
		while(idx < productPrices.length) { // productPrices.length : 5
			System.out.println(srNo+" | \u20b9"+productPrices[idx]+" | "+productRatings[idx]);
			srNo++;
			idx++;
		}
		
		System.out.println(">> After While Loop srNo is: "+srNo+" and idx is: "+idx);
		
		System.out.println();
		
		System.out.println(">>DO- WHILE LOOP");
		// Check Condition Later, Do Job First
		
		
		// do while will be executed at any cost a min of 1 time i.e. even if condition will not satisfy
		// update the values to 1 and 0
		srNo = 5;
		idx = 0;
		
		do {
			System.out.println(srNo+" | \u20b9"+productPrices[idx]+" | "+productRatings[idx]);
			srNo++;
			idx++;
		}while(idx < productPrices.length); //; -> Part of Syntax
	
		System.out.println();
		
		System.out.println(">>FOR LOOP");
		
		// Write everything in 1 line of code
		for(srNo=1, idx=0; idx<productPrices.length; idx++, srNo++) {
			System.out.println(srNo+" | \u20b9"+productPrices[idx]+" | "+productRatings[idx]);
		}
		
		System.out.println();
		
		// we can even create variables in loops itself like below : int i=1
		// Benefit : When loop will finish variable will be destroyed : Optimization on Memory :)
		for(int i=1;i<=5;i++) {
			System.out.println(">> i is: "+i);
		}
		
		System.out.println();
		for(int num=5, times=1;times<=10;times++) {
			System.out.println(num+" "+times+"'s are "+(num*times));
		}
	
		
		System.out.println();
		
		System.out.println(">>ENHANCED FOR LOOP");
		// This is to be used with Arrays or Data Structures i.e. Collections which will come in future discussions
		
		// automatically start from 0th index
		// pick the value of element and put it into price
		// shall terminate automatically. We dont manage indexes here :)
		// price can be any name of your choice
		
		for(int price : productPrices) {
			System.out.println(">> "+price);
		}
		
		// rating can be any name of your choice
		for(double rating : productRatings) {
			System.out.println(">> "+rating);
		}
		
		// PS: We use Enhanced For Loop to perform Read All Operation on Array.
		//     We dont have index to process the Array Elements on the basis of it :(
	}

}
