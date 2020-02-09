package co.edureka.bean;

import java.util.List;

// Model
public class Restaurant {

	// Attributes of Object
	String name;
	String phone;
	String operatingHours;
	Float reviews;
	Integer pricePerPerson;
	
	// Has-A Relationship
	FoodItem item;			  // 1 to 1 Mapping [1 Restaurant Object has reference to 1 FoodItem Object]
	
	// Has-A Relationship
	List<String> departments; // 1 to * Mapping [1 Restaurant Object has many departments (String)]
	
	// Constructors for Object
	public Restaurant() {
		System.out.println(">> Restaurant Object constructed with Default Constructor");
	}
	
	// 1. Constructor Injection
	// Constructor in which we are fulfilling dependency FoodItem
	// i.e. linking reference to FoodItem Object in Restaurant Object
	public Restaurant(FoodItem item) {
		System.out.println(">> Constructor Injection");
		System.out.println(">> Restaurant Object constructed with FoodItem Reference as Input");
		this.item = item;
	}
	
	public Restaurant(String name, String phone, String operatingHours, Float reviews,
			Integer pricePerPerson, FoodItem item) {
		this.name = name;
		this.phone = phone;
		this.operatingHours = operatingHours;
		this.reviews = reviews;
		this.pricePerPerson = pricePerPerson;
		this.item = item;
	}

	// Getters and Setters for Object
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}

	public Float getReviews() {
		return reviews;
	}

	public void setReviews(Float reviews) {
		this.reviews = reviews;
	}

	public Integer getPricePerPerson() {
		return pricePerPerson;
	}

	public void setPricePerPerson(Integer pricePerPerson) {
		this.pricePerPerson = pricePerPerson;
	}

	public FoodItem getItem() {
		return item;
	}

	
	// 2. Setter Injection
	// Setter in which we are fulfilling dependency FoodItem
	// i.e. linking reference to FoodItem Object in Restaurant Object
	public void setItem(FoodItem item) {
		System.out.println(">> Setter Injection");
		this.item = item;
	}
	
	

	public List<String> getDepartments() {
		return departments;
	}

	// Setter Injection
	// Has-A Relationship | 1 to many linking
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", operatingHours=" + operatingHours
				+ ", reviews=" + reviews + ", pricePerPerson=" + pricePerPerson + ", item=" + item + "]";
	}

	
	
}
