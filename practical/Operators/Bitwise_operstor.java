package Core_Java;

import java.util.Scanner;

class Bitwise_operstor {
	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter a first number");
	int num1=in.nextInt();
	System.out.println("Enter a second number");
	int num2=in.nextInt();
	//bitwise and &
	 System.out.println("num1&num2= "+(num1&num2));
	 /*  num1=4 num2=7
	    4- 0100
	    7- 0111 &
	    ---------
	       0100  --4
	  
	  */
	//bitwise or |
	 System.out.println("num1|num2= "+(num1|num2));
	 /*
	  *  4- 0010
	    7-  0111 |
	    ---------
	        0111 --7
	  */
	 
	//bitwise xor ^
	 System.out.println("num1^num2= "+(num1^num2));
	 /*
	  *  4- 0100
	    7-  0111 ^
	    ---------
	        0011 --3
	  */
	 
	//Bitwise not ~
	 System.out.println("~num1= "+(~num1));
	}
}
