/*
 @Author- Shivam Singh
 @Date- 6/10/2022
 Question 2 WAP to find reverse of a number
 */
package Core_Java;

import java.util.Scanner;

class Reverse_Number 
{
	public static void main(String[] args)
	{
		//Creating a Scanner object to take input
		 Scanner in =new Scanner(System.in);
		 System.out.println("Enter a number");
		int n=in.nextInt();
		int i=n;
		//for number is negative
		if(n<0)
		{
			n=n*(-1);
			System.out.println("Reverse of number is -"+reverse(n));
		}
		//for number is positive
		else if(n>0)
		{
			System.out.println("Reverse of number is "+reverse(n));
		}
		
		
	}
	static int reverse(int n)
	{
		//Using numbers 
		int num=0;
				while(n>0) 
				{
					int r=n%10;
					num=num*10+r;
					n=n/10;
				}
				
				return num;
	}

}
