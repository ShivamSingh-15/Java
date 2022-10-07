/*
 * WAP to print table of any number using for loop and take the input from the user
 */
package Core_Java;

import java.util.Scanner;

class Print_Table
{
	public static void main(String[] args)
	{
		//Creating Scanner class to take input
		Scanner in =new Scanner(System.in);
		//Taking input from the user
		System.out.println("Enter a number to print a table");
		int num=in.nextInt();
		
		//using for loop to print table
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d * %d = %d",num,i,num*i);
			System.out.println();
		}
	}
}
