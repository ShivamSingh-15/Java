/*
 * Que1)Arithmetic operation with three variables(Take the input from the user)
 */

package Core_Java;

import java.util.Scanner;

public class Arithematic_Inputuser {
	public static void main(String[] args) {
		//Creating object of Scanner class to take input 
		Scanner in=new Scanner(System.in);
		//getting value from user using Scanner object
		System.out.println("Enter first number ");
		int num1=in.nextInt();
		System.out.println("Enter second number");
		int num2=in.nextInt();
		System.out.println("Enter third number");
		int num3=in.nextInt();
		
		
		//printing value as sum
		System.out.println("Addition is "+(num1+num2+num3));  //performing Addition
		System.out.println("subtraction is "+(num1-num2-num3));  //performing Subtraction
		System.out.println("multiplication is "+num1*num2*num3);  //performing multiplication
		System.out.println("modulas is "+((num1%num2)%num3));  //performing modular
		System.out.println("division is "+((num1/num2)/num3));  //performing division
	}

}
