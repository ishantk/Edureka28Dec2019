package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetAPI {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("George");
		list.add("Kim");
		list.add("Harry");
		list.add("Ana");
		list.add("Sia");
		list.add("Kim");	// Duplicated

		System.out.println("list is: ");
		System.out.println(list);
		
		System.out.println();
		
		// Set<String> set = new HashSet<String>(); 	// RTP
		//HashSet<String> set = new HashSet<String>();	// Direct Object Construction
		TreeSet<String> set = new TreeSet<String>();	// It will also sort the data for us :)
		
		set.add("George");
		set.add("Kim");
		set.add("Harry");
		set.add("Ana");
		set.add("Sia");
		set.add("Kim");	// Duplicated
		
		System.out.println("set is: ");
		System.out.println(set);
		
		// PS: In list data is ordered as it is stored with indexing
		//     In Set data is un-ordered due to HASHING
		
		System.out.println(">> size is: "+set.size());
		if(set.contains("Kim")) {
			System.out.println(">> Kim is in the set");
		}
		
		set.remove("Kim");
		System.out.println(">> set now is: "+set);
		
		System.out.println();
		System.out.println("ITERATOR");
		System.out.println("--------");
		
		// Iterate -> Iterator API as set will not support indexes
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(">> "+name);
		}
		
	}

}
