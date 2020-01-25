package co.edureka.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapAPI {

	public static void main(String[] args) {
		
		//Map<String, Integer> map = new HashMap<String, Integer>();		// RTP
		HashMap<String, Integer> map = new HashMap<String, Integer>();		// Direct Object Construction
		
		map.put("Burger", 100);
		map.put("Fries", 60);
		map.put("Coke", 30);
		map.put("Noodles", 200);
		map.put("Pizza", 300);
		
		// Update Operation
		map.put("Burger", 120);
		
		// Keys in HashMap are UNIQUE, VALUES may be duplicated
		
		map.put(null, 10);
		map.put("Coffee", null);
		
		// PS: Data in HashMap is stored using HASHING technique and hence, it will be un-ordered
		System.out.println(">> map contents:");
		System.out.println(map);
		
		map.remove("Coke");
		
		System.out.println(">> map contents after deletion:");
		System.out.println(map);
		
		System.out.println(">> map size is: "+map.size());
		
		if(map.containsKey("Pizza")) {
			System.out.println(">> Pizza is in the Map");
			int price = map.get("Pizza"); // Read Data on the basis of key
			System.out.println(">> Pizza priced at "+price);
		}
		
		if(map.containsValue(300)) {
			System.out.println(">> 300 in the values of map");
		}
		
		int price = map.get("Burger");
		System.out.println(">> Burger Priced at: "+price);
		
		// Iterate in Map
		// PS: We cannot use for loops to iterate as we don't have indexes
		
		// Get all the keys form the map
		Set<String> keys = map.keySet();
		System.out.println(">> keys are: "+keys);
		
		System.out.println();
		
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(">> KEY: "+key+"\tVALUE: "+map.get(key));
		}
		
		System.out.println(">> ENTRY SET");
		
		Set<Entry<String, Integer>> set = map.entrySet();
		
		Iterator<Entry<String, Integer>> itr1 = set.iterator();
		while(itr1.hasNext()) {
			Entry<String, Integer> entry = itr1.next();
			System.out.println(">> KEY: "+entry.getKey()+"\tVALUE: "+entry.getValue());
		}
		
		System.out.println();
		
		// Hasttable is THREAD-SAFE Version of HashMap i.e. it is SYNCHRONIZED
		Hashtable<Integer, String> table  = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(201, "Jennie");
		table.put(301, "Fionna");
		table.put(401, "Anna");
		table.put(501, "Kim");
		//table.put(null, "Kim");	// null key not supported
		//table.put(601, null);		// null value not supported
		
		System.out.println(">> table is: ");
		System.out.println(table);
	}

}
