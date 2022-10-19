package Core_Java;

import java.util.Arrays;

class ArraysDemo {
 public static void main(String[] args) {
	//declaring Array 
	String[] str=new String[4];
	//Assigning values to array
	str[0]="Shivam";
	str[1]="Rahul";
	str[2]="Mam";
	str[3]="Alex";
	//Traversing array
	for(int i=0;i<str.length;i++) {
		System.out.println(str[i]);
	}
	//using Array toString
	System.out.println(Arrays.toString(str));
}
}
