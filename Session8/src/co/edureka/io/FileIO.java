package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

class Order{
	
	// Attributes
	int oid;
	int price;
	String email;
	
	// Constructors
	Order(){
		oid = 0;
		price = 0;
		email = "NA";
	}
	
	Order(int oid, int price, String email){
		this.oid = oid;
		this.price = price;
		this.email = email;
	}
	
	// Method
	String toCSV() {
		return oid+","+price+","+email+"\n";
	}
	
}

public class FileIO {
	
	void saveOrder(Order order) {
		
		// File IO API's throws Checked Exceptions -> We surround the code with try catch block
		try {
			/*
			File file = new File("/Users/ishantkumar/Downloads/orders-19jan2020.csv");
			//FileWriter writer = new FileWriter(file);		 // will write the data in file as text | overwrite mode
			FileWriter writer = new FileWriter(file, true);  // will write the data in file as text | true is enable append mode
			String data = order.toCSV();
			writer.write(data);
			System.out.println(">> Order with id:"+order.oid+" Saved in File "+file.getName());
			writer.close(); // must close to release memory resources :)
			*/
			
			
			File file = new File("/Users/ishantkumar/Downloads/orders-19jan2020-1.csv");
			// OutputStream works on bytes and hence can work on files like images, audio, video etc...
			//FileOutputStream outputStream = new FileOutputStream(file);      // will write the data in file as bytes | overwrite mode
			FileOutputStream outputStream = new FileOutputStream(file, true);  // will write the data in file as bytes | true is enable append mode
			String data = order.toCSV();
			outputStream.write(data.getBytes());
			System.out.println(">> Order with id:"+order.oid+" Saved in File "+file.getName());
			outputStream.close(); // must close to release memory resources :)
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	void readOrders() {
		// File IO API's throws Checked Exceptions -> We surround the code with try catch block
		// If you will not create it before hand, compiler will prompt later on usage of those API's
		try {
			/*
			File file = new File("/Users/ishantkumar/Downloads/orders-19jan2020.csv");
			FileReader reader = new FileReader(file); 			// read character by character
			BufferedReader buffer = new BufferedReader(reader); // on top of FileReader can read line by line
			
			String line = "";
			while((line = buffer.readLine()) != null) {
				System.out.println("From File: "+line);
			}
			
			buffer.close();
			reader.close();
			*/
			
			File file = new File("/Users/ishantkumar/Downloads/orders-19jan2020-1.csv");
			FileInputStream inputStream = new FileInputStream(file); // read byte by byte
			// Explore if any Buffer like API is available here not :)
			
			int i = 0;
			
			while((i = inputStream.read()) != -1) {
				char ch = (char)i;
				System.out.print(ch);
			}
			
			inputStream.close();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}

	public static void main(String[] args) {
		
		// You can take this as input from User : Scanner Class
		/*Order oRef1 = new Order(1, 200, "john@example.com");
		Order oRef2 = new Order(2, 150, "fionna@example.com");
		Order oRef3 = new Order(3, 450, "john@example.com");
		Order oRef4 = new Order(4, 190, "mike@example.com");
		Order oRef5 = new Order(5, 270, "leo@example.com");
		
		System.out.println(oRef1.toCSV());
		System.out.println(oRef2.toCSV());
		System.out.println(oRef3.toCSV());
		System.out.println(oRef4.toCSV());
		System.out.println(oRef5.toCSV());*/
		
		FileIO io = new FileIO();
		
		//io.saveOrder(oRef1);
		//io.saveOrder(oRef3);
		//io.saveOrder(oRef5);
		
		io.readOrders();

	}

}
