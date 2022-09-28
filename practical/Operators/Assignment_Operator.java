package Core_Java;

import java.util.Scanner;

public class Assignment_Operator {
	public static void main(String[] args) {
		//Creating Scanner object to take input
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=in.nextInt();
		int b=in.nextInt();
		
		//Adding and assigning value
		System.out.println("a+=b "+(a+=b));  //a=a+b;
		
		//Subtracting and assigning 
		  System.out.println("a-=b "+(a-=b));
		//multiplying and assigning 
		  System.out.println("a*=b "+(a*=b));
		//Dividing  and assigning 
		  System.out.println("a/=b "+(a/=b));
		//Modulus and assigning 
		  System.out.println("a%=b "+(a%=b));
	}

}
