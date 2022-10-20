/*
 @Date - 20/10/2022
 @Author- Shivam Singh
 Write a Java program to calculate the average value of array elements.
 */
package Core_Java;

import java.util.Scanner;

class Array_Average
{	
	public static void main(String[] args)
	{
		//Creating Scanner class object to take input from user
		Scanner in =new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=in.nextInt();
		System.out.println("Enter elements of array");
		//Declaring array
		int[] arr=new int[size];
		//Traversing array
	  	 for(int i=0;i<size;i++)
	  	 {
			arr[i]=in.nextInt();
		 }
		float average;
		int sum=0;
		//logic to find sum of array
		 for(int i=0;i<size;i++)
		  {
			sum+=arr[i];
		  }
		average=sum/(float)size;
		System.out.println("Sum of array is "+sum);
		System.out.println("Avearge of array "+average);
	}
}
