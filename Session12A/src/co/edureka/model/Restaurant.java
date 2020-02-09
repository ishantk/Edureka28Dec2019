package co.edureka.model;

import java.util.List;

// Model
public class Restaurant {

	// Attributes of Object
	Integer rid;
	String name;
	String phone;
	String operatingHours;
	Float reviews;
	Integer pricePerPerson;
	
	// Has-A Relationship
	// Address address;	// 1 to 1 Mapping [1 Restaurant Object has reference to 1 Address Object]
	
	// Has-A Relationship
	List<Dish> dishes; // 1 to * Mapping [1 Restaurant Object has reference to Many Dish Objects]
	
	// Constructors for Object
	public Restaurant() {
		
	}
	

	/*public Restaurant(Integer rid, String name, String phone, String operatingHours, Float reviews,
			Integer pricePerPerson, Address address) {
		this.rid = rid;
		this.name = name;
		this.phone = phone;
		this.operatingHours = operatingHours;
		this.reviews = reviews;
		this.pricePerPerson = pricePerPerson;
		this.address = address;
	}*/
	

	public Restaurant(Integer rid, String name, String phone, String operatingHours, Float reviews,
			Integer pricePerPerson, List<Dish> dishes) {
		this.rid = rid;
		this.name = name;
		this.phone = phone;
		this.operatingHours = operatingHours;
		this.reviews = reviews;
		this.pricePerPerson = pricePerPerson;
		this.dishes = dishes;
	}
	
	// Getters and Setters for Object
	public Integer getRid() {
		return rid;
	}


	public void setRid(Integer rid) {
		this.rid = rid;
	}

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

	/*public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}*/

	public List<Dish> getDishes() {
		return dishes;
	}


	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
	

	// toString to display data in Object 
	@Override
	public String toString() {
		return "Restaurant [rid=" + rid + ", name=" + name + ", phone=" + phone + ", operatingHours=" + operatingHours
				+ ", reviews=" + reviews + ", pricePerPerson=" + pricePerPerson + "]";
	}


	
}
