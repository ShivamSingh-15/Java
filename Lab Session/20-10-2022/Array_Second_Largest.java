/*
 @Date - 20/10/2022
 @Author - Shivam Singh
 Write a Java program to find the second largest element in an array.
 */
package Core_Java;

import java.util.Arrays;
import java.util.Scanner;

class Array_Second_Largest
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
		  Arrays.sort(arr);
		  System.out.println(Arrays.toString(arr));
		  System.out.println("Second larget array is "+arr[(arr.length-2)]);
	}
}
