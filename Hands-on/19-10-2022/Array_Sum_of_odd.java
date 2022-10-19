/*
 * 2.Write a program that creates integer array of 10 elements,
 *    accepts values of arrays and Find sum of all odd numbers.
 */
package Core_Java;

import java.util.Scanner;

class Array_Sum_of_odd
{
 public static void main(String[] args)
 {
	//Creating scanner class to take input
	  Scanner in =new Scanner(System.in);
	  //Declaring array
	  int []arr=new int[10];
	  System.out.println("Enter elements of array");
	  //Traversing array
	  for(int i=0;i<arr.length;i++) 
	  {
		  arr[i]=in.nextInt();
	  }
	  //Logic to sum only odd number in array
	   int sum=0;
	  for(int i=0;i<arr.length;i++) 
	  {
		  
		  if((arr[i]%2 )!=0)
			  sum+=arr[i];
	  }
	  System.out.println("Sum of odd numbers in array "+sum);
 }
}
