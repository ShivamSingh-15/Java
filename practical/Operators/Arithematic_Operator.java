package Core_Java;

import java.util.Scanner;

class Arithematic_Operator {
	public static void main(String[] args) {
		//Creating Scanner class to take input from user
		Scanner in=new Scanner(System.in);
		//getting value from user using Scanner object
		System.out.println("Enter first number ");
		int a=in.nextInt();
		System.out.println("Enter second number");
		int b=in.nextInt();
		
		//Writing operation
		int add,sub,mul,mod,div;
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		mod=a%b;
		//printing value as sum
		System.out.println("Addition is "+add);
		System.out.println("subtraction is "+sub);
		System.out.println("multiplication is "+mul);
		System.out.println("modulas is "+mod);
		System.out.println("division is "+div);
	}
}
