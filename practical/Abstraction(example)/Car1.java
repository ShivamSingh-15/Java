package Core_Java;

abstract class Car1 {
	
	private String col;
	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}
	//Declaring abstract method 
	public abstract void speed();
	public abstract void gear();
	
	public void color() {
		System.out.println("Color of car is "+col);
		
	}

}
