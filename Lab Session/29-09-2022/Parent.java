/*
 @author - Shivam Singh
 @date - 29/09/2022
 Ques1:create a class parent with default constructor and void sing method.print something 
 inside the constructor and methodCreate child class which will inherit the property of parent and has
 methods void speak and void dance.print something inside the two methods.
 Create another class inheritance and object of class and call all the methods.
 also mention the type of inheritance on the top of the program
 
 Type of Inheritance - Multilevel Inheritance
 */
package Core_Java;

class Parent {
	//Default Constructor 
	public Parent() {
	  System.out.println("I am The Guru of Dance and Singing academy");	
	}
	
	//creating a method to sing 
	public void sing() {
		System.out.println("Singing a Song of Bollywood Film ");
	}

}
