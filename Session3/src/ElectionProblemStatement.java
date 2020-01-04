
public class ElectionProblemStatement {

	public static void main(String[] args) {
		
		// What we will optimize here !!
		// We will optimize development time of programmer !! And not Running Time of Program !!
		
		// Data for Democratic Party
		int demArizonaVotes = 126;
		int demFloridaVotes = 32;
		int demVermontVotes = 230;
		int demTexasVotes = 21;
		int demGeorgiaVotes = 200;

		// Data for Republican Party
		int repArizonaVotes = 152;
		int repFloridaVotes = 85;
		int repVermontVotes = 121;
		int repTexasVotes = 215;
		int repGeorgiaVotes = 13;
		
		// We need to compute who won ?
		
		int demVoteCount = demArizonaVotes + demFloridaVotes + demVermontVotes + demTexasVotes + demGeorgiaVotes;
		int repVoteCount = repArizonaVotes + repFloridaVotes + repVermontVotes + repTexasVotes + repGeorgiaVotes;
		
		if(demVoteCount > repVoteCount) {
			System.out.println(">> Democratic Party won the Elections by "+(demVoteCount - repVoteCount)+" Votes");
		}else {
			System.out.println(">> Republican Party won the Elections by "+(repVoteCount - demVoteCount)+" Votes");
		}
		
		System.out.println();
		System.out.println("SOLUTION WITH ARRAYS AND LOOPS");
		System.out.println();
		
		// Challenge: We may end up writing so many single value containers
		//			  i.e. for n regions we may write n number of containers
		//            Writing Computation Expression will go adding up huge numbers
		
		// Solution: Arrays and loops to ease the task for us :)
		// 0 index -> Arizona
		// 1 index -> Florida
		// so on an so forth...
		//				  0    1   2    3   4
		int[] demVotes = {126, 32, 230, 21, 200};
		int[] repVotes = {152, 85, 121, 215, 13};
		
		demVoteCount = 0;
		repVoteCount = 0;
		
		// demVotes.length -> 5
		// repVotes.length -> 5
		// Use only 1 for loop and optimize your solution
		for(int i=0;i<demVotes.length;i++) {
			//demVoteCount = demVoteCount + demVotes[i];
			//repVoteCount = repVoteCount + repVotes[i];
			
			demVoteCount += demVotes[i];
			repVoteCount += repVotes[i];
		}
		
		if(demVoteCount > repVoteCount) {
			System.out.println(">> Democratic Party won the Elections by "+(demVoteCount - repVoteCount)+" Votes");
		}else {
			System.out.println(">> Republican Party won the Elections by "+(repVoteCount - demVoteCount)+" Votes");
		}
		
		// Can we optimize the solution More :)
		// YES
		// We will use Array of Arrays as Multi Value Container
		// Multi Dimensioanl Array
		// votes -> Array of Arrays
		int[][] votes = {
						  //  0    1   2   3   4
							{126, 32, 230, 21, 200}, // 0 -> Democratic Party
							{152, 85, 121, 215, 13}  // 1 -> Republican Party
						};
		
		System.out.println(">> votes.length is: "+votes.length); 		// 2
		System.out.println(">> votes[0].length is: "+votes[0].length);  // 5
		System.out.println(">> votes[1].length is: "+votes[1].length);  // 5
		
		System.out.println(">> votes[0][1] is: "+votes[0][1]); 			// 32
		System.out.println(">> votes[1][2] is: "+votes[1][2]);			// 121
	
		/*
		// Array Of Arrays : IMAGE -> Array of Pixels
		//					 Pixel is Array of RGB Value
		int[] pixel1 = {120, 230, 100};
		int[] pixel2 = {120, 230, 100};
		int[] pixel3 = {120, 230, 100};
		
		int[][] image = {
							pixel1, 
							pixel2, 
							pixel3
						};
		 */
		
		/*int[][] votes = {
				    //  0    1   2   3   4
					{126, 32, 230, 21, 200}, // 0 -> Democratic Party
					{152, 85, 121, 215, 13}  // 1 -> Republican Party
				};*/
		
		// results[0] -> 0 | should contain vote count for democratic party
		// results[1] -> 0 | should contain vote count for republican party
		int[] results = {0, 0};
		
		// shall run for 0 and 1 as votes.length is 2
		for(int i=0; i<votes.length; i++) { 
			
			// when i is 0 -> votes[0].length -> 5 | Democratic Party
			//      j 0 to 4
			// when i is 1 -> votes[1].length -> 5 | Republican Party
			//	    j 0 to 4
			// Nested Loop
			for(int j=0; j<votes[i].length; j++) { 
				results[i] += votes[i][j];
			}
		}
		
		System.out.println(">> Democratic Party Vote Count: "+results[0]);
		System.out.println(">> Republican Party Vote Count: "+results[1]);
		
		if(results[0] > results[1]) {
			System.out.println(">> Democratic Party won the Elections by "+(results[0] - results[1])+" Votes");
		}else {
			System.out.println(">> Republican Party won the Elections by "+(results[1] - results[0])+" Votes");
		}
		
		// Image is Array of Pixels
		// Rotate an Image of 3 Pixels
		// Rows gets changed to Columns and Columns to Rows
		int[][] image = {
							{120, 110, 130},
							{110, 130, 120},
							{130, 120, 110},
						};
	}

}
