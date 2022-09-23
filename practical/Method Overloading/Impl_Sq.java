package Core_Java;

public class Impl_Sq {
	public static void main(String[] args) {
		Square1 s1=new Square1();
		s1.setSide(4);
		s1.area();  //calling normal method
		s1.area(3);   //calling overloaded method 
		
	}
}
