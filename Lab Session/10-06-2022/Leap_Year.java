/*
 @Author- Shivam Singh
 @Date- 6/10/2022
 Question1:WAP to Check for Leap Year.Take the input from the user
 */
package Core_Java;

import java.util.Scanner;

class Leap_Year
{
	public static void main(String[] args)
	{
		//Creating a Scanner object to take input
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a year to check its a leap yaear or not ");
		int year=in.nextInt();
		
		//To check leap year 3 conditions are important it should be divisible by 400
		//or divisible by 4 but not 100
		if((year%400==0)||(year%4==0 && year%100!=0))
		{
			System.out.println(year+" is leap year");
		}
		else
			System.out.println(year+" s not a leap year");
	}

}
