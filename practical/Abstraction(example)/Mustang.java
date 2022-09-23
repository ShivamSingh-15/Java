package Core_Java;

class Mustang extends Car1 {

	@Override
	public void speed() {
		System.out.println("This is Mustang it has top speed of 360");
		
	}

	@Override
	public void gear() {
		System.out.println("Your are applying gears ");
		
	}
	
	public static void main(String[] args) {
		Mustang m=new Mustang();
		m.setCol("red");
		m.color();
		m.gear();
		m.speed();
	}
	

}
