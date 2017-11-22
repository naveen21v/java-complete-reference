// Here, Box defines three constructors to initialize the dimensions of a box various ways.
class Box {
	double width;
	double height;
	double depth;
	
	// constructor used when all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// constructor used when no dimensions specified
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// constructor used when cube is created
	Box(double len) {
		width = len;
		height = len;
		depth = len;
	}
	
	// display volume of a box
	double volume() {
		return width * height * depth;
	}
}

class OverloadCons {
	public static void main(String args[]) {
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		
		double vol;
		
		// display volume of first box
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		
		// display volume of second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		
		// display volume of cube
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
	}	
}