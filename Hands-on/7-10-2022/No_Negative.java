/*
 * WAP to demonstrate while loop continues 
until entered number is positive.Take the input from the user
 */
package Core_Java;

import java.util.Scanner;

class No_Negative
{
	public static void main(String[] args)
	{
		//Creating Scanner class to take input
		Scanner in =new Scanner(System.in);
		System.out.println("The while loop execute until you entered a negative number");
		
			
		while(true)
		{
			//Taking input from the user
			System.out.println("Enter a number ");
			int num=in.nextInt();
			if(num<0)
			{
				//When user press a negative number this block execute and break will terminate the loop
				break;
			}
		}
		System.out.println("Loop is ended ");
	}
}
