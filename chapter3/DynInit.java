// Demonstrate dynamic initialization.
class DynInit{
	public static void main(String args[]){
		double a = 3.0, b = 4.0;
		
		// c is dynamically initialized
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println("Hypotenuse is "+c);
	}
}