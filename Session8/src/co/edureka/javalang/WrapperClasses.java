package co.edureka.javalang;

public class WrapperClasses {

	public static void main(String[] args) {
		
		// BOXING	: Convert Primitive type to Object
		// UNBOXING	: Getting Data i.e. Value Back from Object to Primitive
		
		// Primitive Type : Holds Value i.e. Data
		int i1 = 10;
		
		// Reference Types : Holds HashCodes for Objects
		
		// Convert Primitive type to Object
		Integer iRef1 = new Integer(i1); 		// BOXING

		// Convert Object for integer with Data
		Integer iRef2 = new Integer(20);		// BOXING
		
		char ch1 = 'A';
		Character cRef = new Character(ch1);	// BOXING
		
		double d1 = 2.2;
		Double dRef = new Double(d1);			// BOXING
		
		int i2 = iRef1.intValue();				// UNBOXING
		int i3 = iRef2.intValue();				// UNBOXING
		
		char ch2 = cRef.charValue();			// UNBOXING
		
		double d2 = dRef.doubleValue();			// UNBOXING
		
		// AUTO-BOXING	: Convert Primitive type to Object without any object construction
		// AUTO-UNBOXING: Getting Data i.e. Value Back from Object to Primitive without any method execution
		
		int i4 = 10;
		Integer iRef3 = i4; 					// AUTO-BOXING
		
		Character cRef1 = ch1;					// AUTO-BOXING
		
		int i5 = iRef3;							// AUTO-UNBOXING
		char ch3 = cRef1;						// AUTO-UNBOXING
		
		// if in Java we need to use only and only objects we have Wrapper Classes for our Primitives :)
		// While working with data structures -> We use objects and not primitives
		// Here in Java we have Collections Framework which is implementation of Data Structures and will not accommodate primitives :)
		// We need references. Why because data structure implementation like LinkedList will work with references :)
		
	}

}
