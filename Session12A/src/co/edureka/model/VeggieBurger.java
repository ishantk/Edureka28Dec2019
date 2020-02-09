package co.edureka.model;

public class VeggieBurger extends Burger{

	String herbs;
	String spice;
	
	public VeggieBurger() {
		
	}
	
	public VeggieBurger(String herbs, String spice) {
		this.herbs = herbs;
		this.spice = spice;
	}

	public String getHerbs() {
		return herbs;
	}

	public void setHerbs(String herbs) {
		this.herbs = herbs;
	}

	public String getSpice() {
		return spice;
	}

	public void setSpice(String spice) {
		this.spice = spice;
	}

	@Override
	public String toString() {
		return "VeggieBurger [herbs=" + herbs + ", spice=" + spice + ", burgerName=" + burgerName + ", dressing="
				+ dressing + ", dishId=" + dishId + ", name=" + name + ", price=" + price + "]";
	}
	
}
