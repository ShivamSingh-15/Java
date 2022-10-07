/*
 * WAP to print Reverse of numbers for example 10 9 8 7 6 5 4 3 2 1
 *  using do-while loop and take the input from the user.
 */
package Core_Java;

import java.util.Scanner;

class Printing_number_Reverse {
	public static void main(String[] args) {
		//Creating Scanner class to take input
		Scanner in =new Scanner(System.in);
		//Taking input from the user
		System.out.println("Enter a number ");
		int num=in.nextInt();
		
		//Printing in reverse order
		System.out.println("printing number in reverse order");
		for(int i=num;i>=1;i--)
		{
			System.out.print(i+" ");
		}
	}
}
