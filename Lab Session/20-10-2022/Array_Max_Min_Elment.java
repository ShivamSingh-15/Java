/*
 @Date - 20/10/2022
 @Author - Shivam Singh
 4)Write a Java program to find the maximum and minimum value of an array.
 */
package Core_Java;

import java.util.Arrays;
import java.util.Scanner;

class Array_Max_Min_Elment
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
		//Logic to find max ad min element in array
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<size;i++)
		{
			max=max>arr[i]?max:arr[i];
			min=min<arr[i]?min:arr[i];
		}
		System.out.println("Th array is "+Arrays.toString(arr));
		System.out.println("Maximum element in array "+max);
		System.out.println("Minimum element in array "+min);
	}
}
