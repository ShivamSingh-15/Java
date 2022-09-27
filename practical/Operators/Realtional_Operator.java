package Core_Java;

import java.util.Scanner;

public class Realtional_Operator {

	public static void main(String[] args) {
	    //Creating Scanner class to take input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		//Writing Relational operator
		System.out.println("num1==num2 "+(num1==num2));  //performing equal to
		System.out.println("num1>mun2 "+(num1>num2));  //performing greater than
		System.out.println("mun1<mun2 "+(num1<num2));  //performing less than 
		System.out.println("num1!=num2 "+(num1!=num2));  //performing not equal to
		System.out.println("num1>=num2 "+(num1>=num2));  //performing greater than equal to
		System.out.println("num1<=num2 "+(num1<=num2));  //performing less than equal to  

	}

}
