
public class BreakContinue {

	public static void main(String[] args) {
		
		// Algo : Linear Search (from 0 to n-1 you look out for matching data in array)
		//        Use break to optimize your code
		
		// Some Product Codes
		int[] productCodes = {101, 111, 139, 187, 651};
		
		// Product Prices Based on Product Codes indexes
		int[] productPrices = {9000, 1200, 7600, 5400, 3000};
		
		// Use Case: 
		// Customer would like to search a product by product-code and will like to see its price

		
		// Looking up for productCode 139 in our Array
		int productCode = 139;
		int idx = -1;
		
		for(int i=0;i<productCodes.length;i++) {
			
			System.out.println(">> Matching ProducCode "+productCodes[i]);
			
			if(productCode == productCodes[i]) {
				System.out.println(">> Product Code "+productCode+" Found at index "+i);
				idx = i;
				break; // shall terminate the loop
			}
		}
		
		if(idx != -1) {
			System.out.println(">> Product with Product Code "+productCode+" is Priced at \u20b9"+productPrices[idx]);
		}else {
			System.out.println(">> Sorry!! No Product with Product Code "+productCode+" Found");
		}
		
		// Challenge: The moment we find a match loop keeps on running
		// Solution : We must terminate the loop
		//			  And Save Time :)
		
		
		System.out.println();
		
		// break is to terminate the loop
		// continue is to skip the statements and move to next iteration in a loop
		
		for(int i=1;i<=10;i++) {
			
			if(i<=5) {
				continue; // skip the statements below and iterate further
			}
			
			// only for i value more than 5
			System.out.println(">> "+i+") This is Awesome");
		}
		
		// We have some 100 products in array
		// they are having different prices
		// we need to put discount of flat 50 on all those products whose prices are greater than 5000
		// int[] productPrices = {9000, 1200, 7600, 5400, 3000};
		
		for(int i=0;i<productPrices.length;i++) {
			
			if(productPrices[i]<5000) {
				continue; // skip the statements below in the loop and take the next iteration
			}
			
			double newAmount = productPrices[i] - (0.5*productPrices[i]);
			System.out.println(">> "+productPrices[i]+" Slashed Down to "+newAmount);
			
		}
		
		//  i++ -> i = i+1
		//  ++i -> i = i+1

		int x = 10;
		int y = x++;
		// y -> 10 | x -> 11 | Copy First the value of x into y and later increment it
		// int y = ++x;
		// y -> 11 | x -> 11 | increment x first and than copy the value to y
		
	}

}
