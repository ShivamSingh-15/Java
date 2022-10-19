/*
 * 1.Program to input 10 numbers in an array and display only the even numbers if present in the array.
 */
package Core_Java;

import java.util.Scanner;

class Array_Only_Even
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
	  for(int i=0;i<arr.length;i++) 
	  {
		  
		  if((arr[i]%2 )==0)
			  System.out.println(arr[i]+" ");
	  }
}
}
