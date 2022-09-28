package Core_Java;

import java.util.Scanner;

class Logical_Operator {
	public static void main(String[] args) {
		//Creating Scanner object to take input
		Scanner out=new Scanner(System.in);
		//Taking input from the user
		System.out.println("Enter three number ");
		int num1=out.nextInt();
		int num2=out.nextInt();
		int num3=out.nextInt();
		
		boolean c=(num1 > num2) && (num2<num1) ;
		
		//Writing Logical operator 
		System.out.println("num1 > num2 && num2<num1 "+c);                                      //Performing && operation
		System.out.println("num1 > num2 || num2<num1 "+((num1 > num2) || (num2<num1)));      //performing || operation
		System.out.println("! num1 > num2 "+(!(num1 > num2) ) );                             //performing ! operation
		
		System.out.println();
		//Demo of Logical && operation in if else
		System.out.println("Performing && operation");
		if((num1<num2)&&(num2==num3))
		{
			int sum=num1+num2+num3;
			System.out.println("Sum of number is "+sum);
		}
		else
			System.out.println("Condition  is false");
		
		System.out.println();
		//Demo of Logical || operation in if else
		System.out.println("Performng || opration");
		if((num1<num2)||(num2==num3))
		{
			int sum=num1+num2+num3;
			System.out.println("Sum of number is "+sum);
		}
		else
			System.out.println("Condition  is false");

		System.out.println();
		//Demo of Logical ! operation in if else
		System.out.println("Prforming ! operation");
		if(!(num2==num3))
			System.out.println("Condition is actually false");
		else
			System.out.println("Condition is actually true");
	
	}

}
