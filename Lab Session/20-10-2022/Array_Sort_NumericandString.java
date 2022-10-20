/*
  @Date - 20/10/2022
 @Author - Shivam Singh
 2)Write a Java program to sort a numeric array and a string array.
 */
package Core_Java;

import java.util.Arrays;
import java.util.Scanner;

class Array_Sort_NumericandString
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
		System.out.println("Array before sorting "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			//Finding the max element in array
			int last=arr.length-i-1;
			int max=getmax(arr,0,last);
			swap(arr,max,last);
			
		}
		System.out.println("Array after sorting "+Arrays.toString(arr));
	}
	//This method return the index of greatest element of array from start to last
	public static int getmax(int[]arr,int start,int last)
	{
		int max=start;
		for(int i=start;i<=last;i++) {
			max=arr[max]>arr[i]?max:i;
		}
		return max;
	}
	//This method swap the values
	public static void swap(int[] arr,int first,int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
	}
}
