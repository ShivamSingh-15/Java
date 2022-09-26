/*
 * Question 2: create a abstract class car with default constructor and print car is built in that.
 * create abstract void drive method,gearchange method and print gear changed in that method.
Create another class Tesla which extends car and has void drive method with drive safely print.
create an object of class and call drive and gearchange method
 */


package Core_Java;

abstract class Car2 {
  //Constructor 
	public Car2() {
		System.out.println("Car is built");
	}
	
	//creating abstract class 
	abstract void drive();
	public  void gear_change() {
		System.out.println("Gear change");
	}
}
