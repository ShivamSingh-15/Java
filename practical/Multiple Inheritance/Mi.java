package Core_Java;

class Phone{
	public void ring() {
		System.out.println("phone is ringing....");
	}
}
class Smartphone extends Phone{
	public void greet() {
		System.out.println("Hello user you are using Smart Phone");
	}
}

public class Mi extends Smartphone{
	public void name() {
		System.out.println("Hey i am MI which is smartphone ");
	}
	public static void main(String[] args) {
		Mi p1=new Mi();
		p1.ring();
		p1.greet();
		p1.name();
	}
}
