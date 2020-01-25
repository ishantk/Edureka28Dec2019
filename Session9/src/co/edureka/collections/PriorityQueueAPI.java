package co.edureka.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueAPI {

	public static void main(String[] args) {
		
		// Queue<Integer> queue = new PriorityQueue<Integer>();			// RTP
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();	// Direct Object Construction
		
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		
		// Data in Queue is added as :  (Head) 10 9 8 7 6 5 4 3 2 1 (Tail) 
		// BUT
		// PriorityQueue will sort the data for us :)
		// Data in Queue will be :  	(Head) 1 2 3 4 5 6 7 8 9 10 (Tail)

		//int head = queue.peek();  // reads and return head of Queue
		//System.out.println(">> Head is: "+head);
		//System.out.println(">> Size of Queue is: "+queue.size());
		
		//int head = queue.poll();	// remove and return head of Queue
		//System.out.println(">> Head is: "+head);
		//System.out.println(">> Size of Queue is: "+queue.size());
		//System.out.println(">> Head now is: "+queue.peek());
		
		for(int i=0;i<queue.size();i++) {
			int head = queue.poll();
			System.out.println(">> "+head);
		}
		
	}

}
