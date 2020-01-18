package co.edureka.two;

// To Create the Objects of Class outside the Package you need to import it !!
import co.edureka.one.One;	 // Imported class One which was public
//import co.edureka.one.*;	 // Import All. But not recommended as it may import unused classes as well

//import co.edureka.one.Two; // Importing class Two which was default gives an error
// PS: default is only limited to the package and not outside the package :)

// Inheritance Across the Package
// Parent Child Relationship -> Child can access members of Parent if it does not have it :)
class Three extends One{
	
	// Protected member will only be accessible within this class boundary :)
	// Method of Three :)
	void accessParentsMethod() {
		//pvtShow(); // err
		//defShow(); // err
		protShow();  // Protected outside the package can be accessed by the child and default cannot be
		pubShow();
	}
	
}

public class App {
	

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow();		// We are unable to access private
		//oRef.defShow();		// We are unable to access default -> As not accessible outside the package
		//oRef.protShow();		// We are unable to access protected -> As not accessible outside the package
		//oRef.pubShow();		// public -> Accessible Everywhere :)
		
		Three tRef = new Three();
		tRef.accessParentsMethod(); // InDirect Access to Protected
		
		tRef.pubShow(); // Direct Access to public method of Parent One
		//tRef.protShow(); // Error : We cannot access protected member directly

	}

}


// PS: private   : within the class/object
//     default   : within the package
//     protected : within the package | outside the package but with Inheritance technique
//	   public    : within or outside the package