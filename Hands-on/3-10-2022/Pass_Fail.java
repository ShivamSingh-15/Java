/*
 * WAP to demonstrate nested if statement of 5 subjects.the person who gets 
 * above 60% will be passed otherwise failed.output should be
 *  like:Enter your name,Enter marks for the 5 subjects.
 */
package Core_Java;

import java.util.Scanner;

class Pass_Fail {
	public static void main(String[] args) {
		//Creating Scanner class object to take input
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=in.next();
		System.out.println("Enter marks of five subject");
		// taking input of five marks 
		System.out.println("Enter marks of First subject");
		int mark1=in.nextInt();
		System.out.println("Enter marks of Second subject");
		int mark2=in.nextInt();
		System.out.println("Enter marks of Third subject");
		int mark3=in.nextInt();
		System.out.println("Enter marks of fourth subject");
		int mark4=in.nextInt();
		System.out.println("Enter marks of fifth subject");
		int mark5=in.nextInt();
		
		float total=(mark1+mark2+mark3+mark4+mark5)/5.0f;
		System.out.println("Percentage is "+total);
		if(total>=60.0f) {
			System.out.println(name+" you are passed");
			if(total>=70.0f)
				System.out.println(name+" you scored grade C");
			else if(total>80.0f)
				System.out.println(name+" you sored grade B");
			else if(total>=90.0f)
				System.out.println(name+" you scored grade A");
		}
		else
			System.out.println(name+" you are fail");
	}

}
