// Casting int to a byte
class IntToByte {
	public static void main(String args[]) {
		byte b;
		int int1 = 120;
		int int2 = 140;
		
		b = (byte) int1;
		System.out.println("int1 after casting is "+b);

		b = (byte) int2;
		System.out.println("int2 after casting is "+b);		
	}
}