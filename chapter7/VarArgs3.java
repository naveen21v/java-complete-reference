// Demostrate variable-length arguments
class VarArgs3 {
	
	// vaTest using int parameters
	static void vaTest(int ... v) {
		System.out.print("vaTest(int ... v) -> Number of args: " + v.length + " Contents : ");
		
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	// vaTest using boolean parameters
	static void vaTest(boolean ... v) {
		System.out.print("vaTest(boolean ... v) -> Number of args: " + v.length + " Contents : ");
		
		for(boolean x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	// vaTest using a message and int parameters
	static void vaTest(String message, int ... v) {
		System.out.print("vaTest(String message, int ... v)" + message + " : " + v.length + " Contents : ");
		
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}	
	
	public static void main(String args[]) {
		// Notice how vaTest() can be called with args
		// variable number of arguments.
		vaTest(1, 2, 3);
		vaTest("Testing", 10, 20);
		vaTest(true, false, false); // no args
	}
}