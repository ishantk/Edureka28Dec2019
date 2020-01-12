/* In order to make e-Commerce Platform we need to have so many products
	eg: Shoe, LEDTV, MobilePhone etc...... n-number of Objects
	
	Shoe
		pid
		name
		brand
		price
		size
		color
		
	LEDTV
		pid
		name
		brand
		price
		size
		technology
		
	MobilePhone
		pid
		name
		brand
		price
		ram
		memory
		os
		
	...
	..
	.	
	
*/	

/*
class Shoe{
	
	int pid;
	String name;
	String brand;
	double price;
	int size;
	String color;	
	
	void setShoeDetails(int pid, String name, String brand, double price, int size, String color) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.color = color;	
	}
	
	void showShoeDetails() {
		System.out.println("========Shoe Details==========");
		System.out.println(name+"\t"+brand);
		System.out.println(pid+" | "+price);
		System.out.println(size+" | "+color);
		System.out.println("==============================");
		System.out.println();
	}
	
}

class LEDTV{
	
	int pid;
	String name;
	String brand;
	double price;
	int size;
	String technology;	
	
	void setLEDTVDetails(int pid, String name, String brand, double price, int size, String technology) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.technology = technology;	
	}
	
	void showLEDTVDetails() {
		System.out.println("========LEDTV Details==========");
		System.out.println(name+"\t"+brand);
		System.out.println(pid+" | "+price);
		System.out.println(size+" | "+technology);
		System.out.println("==============================");
		System.out.println();
	}
	
}

class MobilePhone{

	int pid;
	String name;
	String brand;
	double price;
	int size;
	int ram;
	int memory;
	String os;
	
	void setMobilePhoneDetails(int pid, String name, String brand, double price, int size, int ram, int memory, String os) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.ram = ram;
		this.memory = memory;
		this.os = os;
	}
	
	void showMobilePhoneDetails() {
		System.out.println("========MobilePhone Details==========");
		System.out.println(name+"\t"+brand);
		System.out.println(pid+" | "+price);
		System.out.println(size+" | "+ram);
		System.out.println(memory+" | "+os);
		System.out.println("==============================");
		System.out.println();
	}
	
}
*/

// Generalize the Products
class Product{
	
	int pid;
	String name;
	String brand;
	double price;
	int size;
	
	Product(){
		System.out.println(">> Product Object Construted");
	}
	
	void setProductDetails(int pid, String name, String brand, double price, int size) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.size = size;
	}
	
	void showProductDetails() {
		System.out.println("********Product Details********");
		System.out.println(name+"\t"+brand);
		System.out.println(pid+" | "+price);
		System.out.println(size);
		System.out.println("*******************************");
	}
}


class Shoe extends Product{
	
	String color;
	
	Shoe(){
		System.out.println(">> Shoe Object Construted");
	}
	
	void setShoeDetails(int pid, String name, String brand, double price, int size, String color) {
		// super is a reference variable which refers to the Parent Object
		//super.setProductDetails(pid, name, brand, price, size);
		setProductDetails(pid, name, brand, price, size);
		this.color = color;	
	}
	
	void showShoeDetails() {
		showProductDetails();
		System.out.println("========Shoe Details==========");
		System.out.println(color);
		System.out.println("==============================");
		System.out.println();
	}
	
}

class LEDTV extends Product{
	
	String technology;	
	
	LEDTV(){
		System.out.println(">> LEDTV Object Construted");
	}
	
	void setLEDTVDetails(int pid, String name, String brand, double price, int size, String technology) {
		setProductDetails(pid, name, brand, price, size);
		this.technology = technology;	
	}
	
	void showLEDTVDetails() {
		showProductDetails();
		System.out.println("========LEDTV Details==========");
		System.out.println(technology);
		System.out.println("==============================");
		System.out.println();
	}
	
}

class MobilePhone extends Product{ // IS-A Relationship | MobilePhone IS-A Product

	int ram;
	int memory;
	String os;
	
	MobilePhone(){
		System.out.println(">> MobilePhone Object Construted");
	}
	
	void setMobilePhoneDetails(int pid, String name, String brand, double price, int size, int ram, int memory, String os) {
		setProductDetails(pid, name, brand, price, size);
		this.ram = ram;
		this.memory = memory;
		this.os = os;
	}
	
	// Implementing Overriding :)
	void showProductDetails() {
		super.showProductDetails();
		System.out.println("========MobilePhone Details==========");
		System.out.println(ram);
		System.out.println(memory+" | "+os);
		System.out.println("==============================");
		System.out.println();
	}
	
}

// Challenge : For n-number of Products we need n-number of classes ?
//			   BUT, We have to write SIMILAR CODE AGAIN and AGAIN

// WhyInheritance : So that we save time on writing the same code again and again :)
//				    Its developer level optimization ie. to save development time :)

public class WhyInheritance {

	public static void main(String[] args) {
		
		// For Every Object below, we will have 1 Parent Object extra in the memory
		// 1 Product 1 Shoe
		// 1 Product 1 LEDTV
		// 1 Product 1 MobilePhone
		Shoe shoe = new Shoe();
		System.out.println();
		
		LEDTV led = new LEDTV();
		System.out.println();
		
		MobilePhone mobile = new MobilePhone();
		System.out.println();
		
		shoe.setShoeDetails(101, "AlphaBounce", "Adidas", 8000, 9, "Black");
		led.setLEDTVDetails(201, "Crystal", "Samsung", 50000, 50, "OLED");
		mobile.setMobilePhoneDetails(301, "iPHone", "Apple", 70000, 7, 3, 128, "iOS");
		
		shoe.showShoeDetails();
		
		led.showLEDTVDetails();

		mobile.showProductDetails();
		

	}

}
