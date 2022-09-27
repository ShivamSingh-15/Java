/*
 * Que)Relational Operations with two variables(Take the input from the User)
 */
package Core_Java;

import java.util.Scanner;

public class Relational_Inputuser {
	public static void main(String[] args) {
		  //Creating Scanner class to take input from the user
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number");
				int num1=sc.nextInt();
				System.out.println("Enter second number");
				int num2=sc.nextInt();
				System.out.println("Enter third number");
				int num3=sc.nextInt();
				
				//Writing Relational operator
				System.out.println("num1==num2 "+(num1==num2));  //performing equal to
				System.out.println("num2>mun3 "+(num2>num3));  //performing greater than
				System.out.println("num3<num2 "+(num3<num2));  //performing less than 
				System.out.println("num1!=num3 "+(num1!=num3));  //performing not equal to
				System.out.println("num1>=num2 "+(num1>=num2));  //performing greater than equal to
				System.out.println("num2<=num3 "+(num2<=num3));  //performing less than equal to  

	}

}
