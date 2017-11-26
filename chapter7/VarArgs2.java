// Demostrate variable-length arguments
class VarArgs2 {
	
	//vaTest now uses a vararg
	static void vaTest(String message, int ... v) {
		System.out.print(message + " : " + v.length + " Contents : ");
		
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		// Notice how vaTest() can be called with args
		// variable number of arguments.
		vaTest("One vararg", 10); // 1 arg
		vaTest("Three varargs", 1, 2, 3); // 3 args
		vaTest("No varargs"); // no args
	}
}