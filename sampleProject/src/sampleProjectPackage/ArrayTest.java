package sampleProjectPackage;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args)
	{
	int size;
	int  d ,loc=0;
	boolean flag  = false;
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the array size::");
	size = sc.nextInt();
	int arr[]  = new int[size];
	System.out.println("Please enter"+size+"  values for array ::");
	for(int i = 0 ; i < size ; i++ )
	{
		arr[i]= sc.nextInt();
	}
	
	System.out.println("Please enter the element for delete");
	d = sc.nextInt();
	
	 for(int i = 0; i<size ; i++)
	 {
		 if(arr[i] == d)
		 {
			 flag = true;
			 loc = i;
			 break;
		 }else
			 flag = false;
		 
	 }
	 if(flag)
	 {
		for(int i =loc+1 ;i<size ;i++)
		{
			arr[i-1]=arr[i];
			
		}
	 
	 System.out.println("After deleting element::");
	 for(int i = 0 ; i < size -1; i++)
	 {
		 System.out.println(arr[i]);
	 }
	 }else
		 System.out.println("Element not found");
	
	}
	
	

}
