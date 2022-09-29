/*
 @author - Shivam Singh
 @date - 29/09/2022
 Ques3:Create a program for calculation.read three values from the user for operation
first and second values as operands.
third value as operator.
if user press1 => print addition of first and second
if user press2 => print subtraction of first and second
if user press3 => print multiplication of first and second
if user press4 => print division of first and second
 */
package Core_Java;

import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
	//Creating Scanner class object to take input
		Scanner in=new Scanner(System.in);
		System.out.println("press 1 => For addition of first and second");
		System.out.println("press 2 => For subtraction of first and second");
		System.out.println("press 3 => For multiplication of first and second");
		System.out.println("press 4 => For division of first and second");
		System.out.println();
		
		//Taking user choice
		System.out.println("Enter your choice");
		int choice=in.nextInt();
		
		
		
		System.out.println();
		
		//using if else
	/*	//Checking whether user input invalid choice
		if(choice>=1 && choice<=4) 
	{
			//taking input from the user
			System.out.println("Enter two Number");
			System.out.println("Entr first Number");
			int num1=in.nextInt();
			System.out.println("Enter second number");
			int num2=in.nextInt();
			
		if(choice==1)
		{
			System.out.println("Sum of numbers is "+(num1+num2));
		}
		else if(choice==2)
			System.out.println("Subtraction of two numbers is "+(num1-num2));
		else if(choice==3)
			System.out.println("Multiplication of two numbers is "+(num1*num2));
		else if(choice==4)
			System.out.println("Division of two number is "+(num1/num2));
		
	}
	else {
			System.out.println("Invalid Choice");
		} 
		*/
		
		//using switch case
		switch(choice) {
		case 1:
		  System.out.println("Enter two Number");
		  System.out.println("Entr first Number");
		  int num1=in.nextInt();
		  System.out.println("Enter second number");
		  int num2=in.nextInt();
		  System.out.println("Sum of numbers is "+(num1+num2));
		 break;
		case 2:
			System.out.println("Enter two Number");
			System.out.println("Entr first Number");
			int a=in.nextInt();
			System.out.println("Enter second number");
			int b=in.nextInt();
			System.out.println("Subtraction of two numbers is "+(a-b));
			break;
		case 3:
			System.out.println("Enter two Number");
			System.out.println("Entr first Number");
			int c=in.nextInt();
			System.out.println("Enter second number");
			int d=in.nextInt();
			System.out.println("Multiplication of two numbers is "+(c*d));
			break;
		case 4:
			System.out.println("Enter two Number");
			System.out.println("Entr first Number");
			int n=in.nextInt();
			System.out.println("Enter second number");
			int m=in.nextInt();
			System.out.println("Division of two number is "+(n/m));
			break;
		default :
			System.out.println("Invalid Choice");
			
		}
	}

}
