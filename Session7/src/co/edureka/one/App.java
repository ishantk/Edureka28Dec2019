package co.edureka.one;

public class App {

	public static void main(String[] args) {
		
		// Object Construction for One and Two class
		One oRef = new One();
		Two tRef = new Two();
		
		// Access Methods
		// In public class
		//oRef.pvtShow();		// We are unable to access private
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();

		// In default class
		//tRef.pvtShow();		// We are unable to access private
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();


	}

}

// PS: only private in the same package will not be accessible. Others will be.
//	   private is only accessible within the boundary of object/class
