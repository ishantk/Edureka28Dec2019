package co.edureka.model;

// Model
public class Address {
	
	// Attributes of Address Object
	Integer aid;
	String adrsLine;
	String city;
	String state;
	Integer zipCode;
	
	// Has-A Relationship
	Restaurant restaurant; // 1 to 1 Mapping [1 Address Object has reference to 1 Restaurant Object]

	// Constructors for Object
	public Address() {
		
	}
	
	public Address(Integer aid, String adrsLine, String city, String state, Integer zipCode, Restaurant restaurant) {
		this.aid = aid;
		this.adrsLine = adrsLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.restaurant = restaurant;
	}

	// Getters and Setters for Object
	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	// toString to display data in Object 
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", adrsLine=" + adrsLine + ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode+ "]";
	}

}
