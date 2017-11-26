class Factorial {
	static int callCounter = 0;
	
	// this is a recursive method
	int fact(int n) {
		int result;
		callCounter++;
		
		System.out.println("callCounter, n : " + callCounter + ", " + n);
		
		if(n == 0)
			return 1;
		
		result = n * fact(n-1);
		
		System.out.println("result : " + result);
		
		return result;
	}
}

class Recursion {
	public static void main(String args[]) {
		Factorial f = new Factorial();
		
		System.out.println("Factorial of 0 is " + f.fact(0)); Factorial.callCounter = 0;
		System.out.println("Factorial of 1 is " + f.fact(1)); Factorial.callCounter = 0;
		System.out.println("Factorial of 3 is " + f.fact(3)); Factorial.callCounter = 0;
		System.out.println("Factorial of 4 is " + f.fact(4)); Factorial.callCounter = 0;
		System.out.println("Factorial of 5 is " + f.fact(5));
	}
}