
public class MultiDimArrays {

	public static void main(String[] args) {
		
		// Array of Arrays
		// 2D Array
		int[][] a1 = {
						{10, 20, 30, 40},		//0
						{10, 20, 30, 40, 50},	//1
						{10, 20},				//2
						{10, 'A'},				//3
						{10, 20, 30}			//4
					 };
		
		// We can store characters in int array -> BUT, their ASCII Code will be stored
		
		System.out.println(">> a1 is: "+a1);					// HashCode
		System.out.println(">> a1 length is: "+a1.length);		// 5
		System.out.println(">> a1[0] is: "+a1[0]);				// HashCode
		System.out.println(">> a1[0] length is: "+a1[0].length);// 4
		System.out.println(">> a1[0][2] is: "+a1[0][2]);		// 30
		
		System.out.println();
		
		for(int i=0;i<a1.length;i++) {
			System.out.println(">> a1["+i+"] is: "+a1[i]);
		}
		
		System.out.println();
		
		// i: 0, 1, 2, 3, 4 as a1.length is 5
		for(int i=0;i<a1.length;i++) { // i:0, j: 0, 1, 2, 3 | i:1, j:0, 1, 2, 3, 4 | i:2, j:0, 1 | i:3, j:0 | i:4, j:0, 1, 2
			
			for(int j=0;j<a1[i].length;j++) {
				System.out.print(a1[i][j]+"  "); // print -> shall print the data in the same line
			}
			
			System.out.println(); // Empty println to go on next line
		}
		
		// Array of Array of Arrays
		// 3D Array -> Collection of 2D Arrays
		int[][][] a2 = {
				
						{
							{10, 20, 30, 40},		//0
							{10, 20, 30, 40, 50},	//1
							{10, 20},				//2			// 0
							//0   1
							{10, 'A'},				//3
							{10, 20, 30}			//4
						 },
						
						 {
							{10, 20, 30, 40},		//0
							{10, 20, 30, 40, 50},	//1
							{10, 20},				//2			// 1
							{10, 'A'},				//3
							{10, 20, 30}			//4
						 } 						
						
					 };
		
		System.out.println(">> a2 is: "+a2);					// HashCode
		System.out.println(">> a2 length is: "+a2.length);		// 2
		System.out.println(">> a2[0][3][1] is: "+a2[0][3][1]);	// 65

		System.out.println();
		
		// We will not put data, we will just give size.
		
		// a3 is a 2-D Array of 3 1-D Arrays with each 1-D Array having 5 elements
		// Since, we are not giving the data, so by default all the values will be 0.
		int[][] a3 = new int[3][5];
	
		for(int i=0;i<a3.length;i++) { // i:0, j: 0, 1, 2, 3 | i:1, j:0, 1, 2, 3, 4 | i:2, j:0, 1 | i:3, j:0 | i:4, j:0, 1, 2
			
			for(int j=0;j<a3[i].length;j++) {
				System.out.print(a3[i][j]+"  "); // print -> shall print the data in the same line
			}
			
			System.out.println(); // Empty println to go on next line
		}
		
		//int[][] a4 = new int[][];  // error
		//int[][] a5 = new int[][5]; // error
		
		// We can mention how many 1-D Arrays and later can decide what data to be stored in them
		int[][] a6  = new int[3][];  // OK
		a6[0] = new int[5];
		a6[1] = new int[15];
		a6[2] = new int[25];
		
		System.out.println();
		
		a6[0][1] = 12;
		
		for(int i=0;i<a6.length;i++) { // i:0, j: 0, 1, 2, 3 | i:1, j:0, 1, 2, 3, 4 | i:2, j:0, 1 | i:3, j:0 | i:4, j:0, 1, 2
			
			for(int j=0;j<a6[i].length;j++) {
				System.out.print(a6[i][j]+"  "); // print -> shall print the data in the same line
			}
			
			System.out.println(); // Empty println to go on next line
		}
		
		// PS: Explore how to implement Enhanced For Loop on 2-D and 3-D Arrays :)
		
		//     Problem on Array
		//     int[] arr = {10, 20, 30, 40, 50};
		//     int shift = 3
		//     rotate to right in cyclic approach by 3
		//     {30, 40, 50, 10, 20} 
		
		// Attempt more aggressive programs for your interview preprations
		// https://app.codility.com/programmers/lessons/1-iterations/
		
	}
	
	
}
