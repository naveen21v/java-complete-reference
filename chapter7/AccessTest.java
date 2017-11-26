class Test {
	int a; // default access
	public int b; // public access
	private int c; // private access
	
	void setC(int c) {
		this.c = c;
	}
	
	int getC() {
		return c;
	}
}

class AccessTest {
	public static void main(String args[]) {
		Test ob = new Test();
		
		ob.a = 10;
		ob.b = 20;
		
		// This will cause an error
		// ob.c = 30;
		
		ob.setC(30);
		System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getC());		
	}
}