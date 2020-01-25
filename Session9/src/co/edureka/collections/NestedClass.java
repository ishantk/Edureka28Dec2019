package co.edureka.collections;

class LinkedList{
	
	class Node{
		void showNode() {
			System.out.println(">> Showing Node");
		}
	}
	
	void add(int data) {
		System.out.println(">> Adding Data: "+data);
	}
	
	void showList() {
		//Node node = new Node();
		System.out.println(">> Showing Data");
		//node.showNode();
	}
	
}

// Outer Class
class HashMap{
	
	// Inner Class or Nested Class
	class Entry{
		
	}
	
}

public class NestedClass {

	public static void main(String[] args) {
		
		// Outer Class Object
		LinkedList list = new LinkedList();
		list.showList();

		// Inner Class Object
		LinkedList.Node node = list.new Node();
		node.showNode();

	}

}
