package Core_Java;

class Square1 {
	private int side;

	
	public void setSide(int side) {
		this.side = side;
	}
	//creating a method to print area of square
	 public void area() {
		 System.out.println("area of aquare is "+side*side);
	 }
	 //overloading the area method 
	 public void area(int a) {
		 System.out.println("area of square is "+a*a);
	 }
}
