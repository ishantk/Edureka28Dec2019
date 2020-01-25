package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Song{
	
	// Attributes
	String title;
	String artist;
	double duration;
	
	public Song(String title, String artist, double duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	
	void showSong() {
		System.out.println("--------------------------------");
		System.out.println(title+"\t"+artist+"\t"+duration);
		System.out.println("--------------------------------");
	}
	
	// toString belongs to Object class and we have overrided it in Song i.e. Child Class
	// if we would like to show data/meaningful information instead of hash codes
	public String toString() {
		return title+"\t"+artist+"\t"+duration;
	}
	
}

public class ArrayListAPI {

	public static void main(String[] args) {
	
		// Object Construction Statements:
		
		// Raw Type: We can store any object in it
		// Hetro
		ArrayList list1 = new ArrayList();
		// List list1 = new ArrayList();	// Polymorprhic Statement : List is an interface which is implemented by ArrayList class
		
		// Generic : Type Specific
		// Homo
		ArrayList<String> list2 = new ArrayList<String>();	// Can only store Strings here
		
		ArrayList<Song> list3 = new ArrayList<Song>();		// Can only store Song Objects here
		
		
		Song song1 = new Song("Ek Toh Zindagi", "Neha", 3.20);
		Song song2 = new Song("Akhiyon Se", "Mika", 4.20);
		Song song3 = new Song("Ruk Zara", "Stebin", 3.50);
		
		// 1. Add Data in ArrayList
		list1.add(100);
		list1.add(2.2);
		list1.add("John");
		list1.add(song1);
		
		list2.add("John");		// 0
		list2.add("Jennie");
		list2.add("Fionna");
		list2.add("John");	// List can have duplicate data :)
		list2.add("Jack");
		list2.add("Kia");		// size - 1
		//list2.add(2.2);	// err
		//list2.add(song1);	// err

		list3.add(song1);	// 0
		list3.add(song2);	// 1
		list3.add(song3);	// 2
		//list3.add(2.2);		// err
		//list3.add("John");	// err
		
		// 2. Print Data in List
		System.out.println(">> list1 contents:");
		System.out.println(list1);
		
		System.out.println(">> list2 contents:");
		System.out.println(list2);
		
		System.out.println(">> list3 contents:");
		System.out.println(list3);
		
		// 3. Size of ArrayList
		System.out.println(">> list1 size is: "+list1.size());
		System.out.println(">> list2 size is: "+list2.size());
		System.out.println(">> list3 size is: "+list3.size());
		
		// 4. Update Data in ArrayList
		list2.set(1, "Mike");
		System.out.println(">> list2 now is: "+list2);
		
		// 5. Remove Operation
		//list2.remove(1); // index
		//System.out.println(">> list2 after removing 1st index is: "+list2);
		list2.remove("John");	// Wherever we find John, we will delete it :)
		System.out.println(">> list2 after removing John is: "+list2);
		
		// 6. Get Data from List
		String name = list2.get(1);
		System.out.println(">> index 1 data is: "+name);
		
		// 7. Membership Testing
		if(list2.contains("Fionna")) {
			System.out.println(">> Fionna is in the list");
		}
		
		Song song = list3.get(2);
		song.showSong();
		
		// 8. Iterate in List
		// 8.1 Basic For Loop
		
		// Object is Parent to all the classes in Java
		// Ref Var of Object can point to any type :) RTP
		// For Hetro, we have mixed data and we cant fix which type is it. So we have object for the same :)
		System.out.println(">> BASIC FOR LOOP");
		for(int i=0;i<list1.size();i++) {
			Object o = list1.get(i);
			System.out.println(">> "+o);
		}
		
		System.out.println("------");
		
		for(int i=0;i<list2.size();i++) {
			String s = list2.get(i);
			System.out.println(">> "+s);
		}
		
		System.out.println("------");
		
		for(int i=0;i<list3.size();i++) {
			Song s = list3.get(i);
			System.out.println(">> "+s);
		}
		
		System.out.println();
		
		System.out.println(">> ENHANCED FOR LOOP");

		System.out.println();
		
		// Enhanced For Loop -> No Index Management and shall copy the data one by one :)
		
		for(Object o : list1) {
			System.out.println(">> "+o);
		}
		System.out.println("------");
		
		for(String s : list2) {
			System.out.println(">> "+s);
		}
		
		System.out.println("------");
		
		for(Song s : list3) {
			System.out.println(">> "+s);
		}
		
		System.out.println();
		System.out.println(">> ITERATOR");
		System.out.println();
		
		Iterator<Object> itr1 = list1.iterator();
		Iterator<String> itr2 = list2.iterator();
		Iterator<Song> itr3 = list3.iterator();
		
		/*
		System.out.println(">> "+itr1.next());
		System.out.println(">> "+itr1.next());
		
		System.out.println();
		
		System.out.println(">> "+itr2.next());
		System.out.println(">> "+itr2.next());
		
		System.out.println();
		
		System.out.println(">> "+itr3.next());
		System.out.println(">> "+itr3.next());*/
		
		System.out.println();

		while(itr1.hasNext()) {
			Object o = itr1.next();
			System.out.println(">> "+o);
		}
		
		System.out.println();
		
		while(itr2.hasNext()) {
			String s = itr2.next();
			System.out.println(">> "+s);
			
			// Iterator, we can delete data 
			if(s.equals("Kia")) {
				itr2.remove();
			}
			
		}
		
		System.out.println();
		
		while(itr3.hasNext()) {
			Song s = itr3.next();
			System.out.println(">> "+s);
		}
		
		System.out.println();
		System.out.println(">> list2 after iterator is: "+list2);
		
		System.out.println();
		System.out.println(">> LIST ITERATOR");
		System.out.println();
		
		ListIterator<String> listItr2 = list2.listIterator();
		
		while(listItr2.hasNext()) {
			String s = listItr2.next();
			System.out.println(">> "+s);
		}
		System.out.println("----------");
		while(listItr2.hasPrevious()) {
			String s = listItr2.previous();
			System.out.println(">> "+s);
		}
		
		System.out.println();
		System.out.println(">> ENUMERATION");
		System.out.println();
		
		// Enumeration is read only, we cannot delete data here
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()) {
			String s = enm.nextElement();
			System.out.println(">> "+s);
		}
		
		// Removes all of the data from list
		//list2.clear();
		//System.out.println(">> list2 is: "+list2);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("George");
		names.add("Kim");
		names.add("Harry");
		
		// We can even add all the data from one list into another in one go :)
		names.addAll(list2);
		System.out.println(">> names is: "+names);
		
		int idx = names.indexOf("Harry");
		System.out.println(">> idx: "+idx);
		
		// PS: Explore some more APIs. Refer Documentation on Oracle Website :)
		
		// Same as ArrayList: But it is THREAD-SAFE Version :)
		Vector<String> vector = new Vector<String>();
		vector.add("George");
		vector.add("Kim");
		vector.add("Harry");
		
		System.out.println(">> vector is: "+vector);
	}

}
