class CA{
	
	// Attribute of Object
	int a;
	
	// Attribute of Class
	static int b;
	
	// Method of Object
	void show() {
		System.out.println(">> This is show of CA Object");
	}
	
	// Method of Class
	static void hello() {
		System.out.println(">> This is hello for CA Class");
	}
}

class CB extends CA{
	
	
}

public class ObjectVsClassInheritance {

	public static void main(String[] args) {

		CB cRef = new CB();
		cRef.a = 10;
		cRef.show();
		
		CB.b  = 100;
		CB.hello();

	}

}
