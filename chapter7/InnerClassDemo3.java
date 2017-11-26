// Demostrate an inner class

class Outer {
	int outer_x = 100;
	
	void test() {
		for(int i=0; i<10; i++) {
			// this is an inner class
			class Inner {
				void display() {
					System.out.println("display outer_x = " + outer_x);
				}
			}
				
			Inner inner = new Inner();
			inner.display();			
		}
	}
}

class InnerClassDemo3 {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();		
	}
}