package co.edureka.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {

	CA ca; // Has-A Relationship
	
	public CB(){
		
	}
	
	// @Autowired is an Annotation -> This will automatically link the dependency by name
	//@Autowired
	public CB(CA ca){
		this.ca = ca;
		System.out.println(">> Constructor Injection");
	}

	public CA getCa() {
		return ca;
	}

	@Autowired
	public void setCa(CA ca) {
		this.ca = ca;
		System.out.println(">> Setter Injection");
	}
	
}
