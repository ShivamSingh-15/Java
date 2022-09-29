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

//In this class we are creating object and calling the methods.
class Inheritance extends Child{
	public static void main(String[] args) {
		
	
	//creating object of Inheritance class
	Inheritance i1=new Inheritance();
    
	//calling methods 
	  i1.sing();   
	  i1.speak(); 
	  i1.dance();  
	}

}
