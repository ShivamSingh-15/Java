package Core_Java;

class Rectangle extends Square1 {

	 int l;
	 
	public void setl(int l) {
		this.l=l;
	}
	//overriding method area(int a) of class Square1
	@Override
	public void area(int a) {
	  System.out.println("Area of Rectangle is "+l*a);
	}
  

}
