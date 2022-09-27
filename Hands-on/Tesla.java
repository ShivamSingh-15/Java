/*
 * Create another class Tesla which extends car and has void drive method with drive safely print.
create an object of class and call drive and gearchange method
 */


package Core_Java;

public class Tesla extends Car2 {

	@Override
	void drive() {
	   System.out.println("Drive safely");
		
	}
	public static void main(String[] args) {
		Tesla t=new Tesla();
		t.drive();
		t.gear_change();
	}
	

}
