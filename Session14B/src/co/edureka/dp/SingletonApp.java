package co.edureka.dp;

class Connection {
	
	static int count=0;

	// Lets Create the Object within the Class itself
	private static Connection con = new Connection();
	
	private Connection() {
		count++;
		System.out.println(">> Connection Object Constructed");
	}
	
	// public static method which return reference to Connection Object
	public static Connection getConnetion() {
		return con;
	}
}

public class SingletonApp {

	public static void main(String[] args) {
		
//		Connection con1 = new Connection();
//		Connection con2 = new Connection();
//		Connection con3 = new Connection();
		
		Connection con1 = Connection.getConnetion();
		Connection con2 = Connection.getConnetion();
		Connection con3 = Connection.getConnetion();
		
		System.out.println(">> con1 is: "+con1);
		System.out.println(">> con2 is: "+con2);
		System.out.println(">> con3 is: "+con3);
		
		System.out.println(">> TOTAL CONNECTION OBJECTS: "+Connection.count);

	}

}
