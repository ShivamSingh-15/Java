package Core_Java;

import java.util.Scanner;

class Unary_Operator {
	public static void main(String[] args) {
		//Creating Scanner object to take input
		Scanner out=new Scanner(System.in);
		System.out.println("Enter a negative number and i will convert it to positive"
				+ "and perform increment and decrement");
		int num=out.nextInt();
		
		//Performing unary operator 
		System.out.println("what is value of -(-5) "+(-num));
		//Performing ++(increment operator)
		System.out.println("Performing ++(increment operator) "+(++num));
		
		//Performing --(decrement operator)
		System.out.println("Performing --(decrement operator)"+(num--));
		
	}

}
