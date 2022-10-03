/*
 * WAP to test whether the person is applicable to give vote usinf If-Else
 */
package Core_Java;

import java.util.Scanner;

class Vote {
	public static void main(String[] args) {
		//Creating Scanner class object to take input
				Scanner in=new Scanner(System.in);
				System.out.println("Enter your name");
				String name=in.next();
//				taking input of age
				System.out.println("Enter your age");
				int age=in.nextInt();
				//Checking that person can vote or note
				if(age>=18)
					System.out.println(name+" you can vote");
				else
					System.out.println(name+" you cann't vote");
	}
}
