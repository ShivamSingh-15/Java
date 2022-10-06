/*
 @Author- Shivam Singh
 @Date- 6/10/2022
 Question4:WAP to check the condition for checking the correct password using If-Else.Take input from the user.
 */
package Core_Java;

import java.util.Scanner;

class Checking_Password 
{
	public static void main(String[] args) 
	{
		//Creating a Scanner object to take input
		 Scanner in =new Scanner(System.in);
		 System.out.println("Enter your name");
		 String name=in.nextLine();
		 System.out.println("Welcome "+name+" please enter your password to proceed");
		 int password=in.nextInt();
	
		 //Checking password is correct or not
		 if(password==12345)
			 System.out.println("password is correct you are login");
		 else
			 System.out.println("password is incorrect please try again");
	}
}
