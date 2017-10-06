// Hexadecimal and decimal test
class HexadecimalDemo{
	public static void main(String args[]){
		long number;
		
		number = 0x10L;
		
		System.out.println("number = "+number);
		
		number = number + 0xF;
		
		System.out.println("Now, number = "+number);
	}
}