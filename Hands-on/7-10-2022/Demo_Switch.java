/*
 * WAP to demonstrate on switch case using input from the user
 */
package Core_Java;

import java.util.Scanner;

class Demo_Switch
{
	public static void main(String[] args)
	{

		//Creating Scanner class to take input
		Scanner in =new Scanner(System.in);
		//Taking input from the user
		System.out.println("Enter a number from 1 to7 and i will show you the coresponding day");
		int num=in.nextInt();
	switch(num)
	{
		  case 1:
		  { System.out.println("Monday");
		    break;
		  }
		  case 2:
		  { System.out.println("Tuesday");
		    break;
		  }
		  case 3:
		  { System.out.println("Wednesday");
		    break;
		  }
		  case 4:
		  { System.out.println("Thursday");
		    break;
		  }
		  case 5:
		  { System.out.println("Friday");
		    break;
		  }
		  case 6:
		  { System.out.println("Saturday");
		    break;
		  }
		  case 7:
		  { System.out.println("Sonday");
		    break;
		  }
		  default:
		  {
			  System.out.println("Invalid choice");
		  }
	}
	}
}
