/*
 @author - Shivam Singh
 @date - 29/09/2022
  Ques2. Create a program to find largest of two numbers.
 */
package Core_Java;

import java.util.Scanner;

class Largest_Among_Two {
	public static void main(String[] args) {
	
    //Creating Scanner class object to take input
	Scanner in=new Scanner(System.in);
	System.out.println("Enter two Number");
	System.out.println("Entr first Number");
	int num1=in.nextInt();
	System.out.println("Enter second number");
	int num2=in.nextInt();
	
	//checking num1>num2 
	if(num1>num2) {
		System.out.println(num1+" is largest");
	}
	else {
		System.out.println(num2+" is largest");
	}
	
	}
}
