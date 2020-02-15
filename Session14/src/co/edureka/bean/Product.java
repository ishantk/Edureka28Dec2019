package co.edureka.bean;

public class Product {

	// Attributes
	int pid;
	String name;
	String brand;
	int price;
	int stock;
	int state;
	
	public Product() {
		
	}

	public Product(int pid, String name, String brand, int price, int stock, int state) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.stock = stock;
		this.state = state;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	/*
	// Business Logic Method
	public void purchaseProduct(String where, String when) {
		
		// 1. Check for the Product Stock | This may be a task
		if(stock > 0) {
			
			System.out.println(">> Stock Validated");
			System.out.println("--------------");
			
			// 2. Process Payments
			// Ask for payment method and then process the same
			System.out.println(">> Online Bank Transaction Selected");
			System.out.println(">> Thank You, for Making Transaction");
			
			System.out.println("---------------");
			
			// 3. Notify Customer and Logistics Department
			System.out.println(">> Email Sent Successfully !!");
			System.out.println(">> "+name+" will be delivered at "+where+" by "+when);
			System.out.println();
			System.out.println(">> Logistics Notified. Please Process the Shipment !!");
			
		}else {
			System.out.println(">> Sorry !! We are Out Of Stock !! Please Try Later !!");
		}
	}*/
	
	// We will try to write only CORE LOGIC in our BUSINESS METHOD :)
	public void purchaseProduct(String where, String when) {
		
		if(state == 1) {
			// 2. Process Payments
			// Ask for payment method and then process the same
			System.out.println(">> Online Bank Transaction Selected");
			System.out.println(">> Thank You, for Making Transaction");
		}else {
			System.out.println(">> Sorry !! We are Out Of Stock !! Please Try Later !!");
		}
		
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brand=" + brand + ", price=" + price + ", stock=" + stock
				+ ", state=" + state + "]";
	}
	
}
