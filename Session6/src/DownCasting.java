class One{
	
}

class Two extends One{
	
}

class Three extends One{
	
}


public class DownCasting {

	public static void main(String[] args) {
		
		// Direct Object Constructions
		/*
		One oRef = new One();
		Two tRef = new Two();
		*/
		
		// Polymorphic Statement : Ref Var of Parent can point ot Object of Child
		//One oRef = new Two();
		
		//Two tRef = new Two();
		//One oRef = tRef; 		// Polymorphic Statement | UP-CASTING :)
		
		One oRef = new Two();
		// oRef has Reference to Two Object
		//Two tRef = oRef; // error
		Two tRef = (Two)oRef;	// DOWN-CASTING | Type Safety Check by Compiler :)
	}

}
