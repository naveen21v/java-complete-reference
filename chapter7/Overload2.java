// Automatic type conversions apply to overloading.
class OverloadDemo {
	
	void test() {
		System.out.println("No Parameters");
	}
	
	// for two integers paramters
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}
	
	// for one double paramter
	void test(double a) {
		System.out.println("Inside test(double) a: " + a);
	}
}

class Overload2 {
	public static void main(String args[]) {
		OverloadDemo ob = new OverloadDemo();
		int i = 88;
		
		// call all version of test
		ob.test();
		ob.test(10, 20);
		
		ob.test(i); // this will invoke test(double)
		ob.test(123.2); // this will invoke test(double)
	}
}