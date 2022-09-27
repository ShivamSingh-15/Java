/*
 * Question 3: create class Animal with method void eat and print I am a omnivorous.another class Mammal 
 * extend Animal with method void nature and prints I am a Mammal.another class Dog extends
 *  Mammal with method void sound and prints I bark.create a main method and object of class and call all the methods.
 */

package Core_Java;

public class Dog1 extends Mammal {
	//creating method sound()
	public void sound() {
		System.out.println("I bark");
	}
	
	public static void main(String[] args) {
		Dog1 d=new Dog1();
		d.eat();
		d.nature();
		d.sound();
	}

}
