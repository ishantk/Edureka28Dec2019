package co.edureka.bean;

// Inheritance
// IS-A Relationship in Spring Core
// Pizza IS-A FoodItem :)
public class Pizza extends FoodItem{
	
	int size;
	String description;
	
	public Pizza() {
		
	}
	
	public Pizza(int size, String description) {
		this.size = size;
		this.description = description;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", description=" + description + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
