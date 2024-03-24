package com.jspider.student;

public class Exception2 {

	public static void main(String[] args) {
		int ar[]= {50,20,30,40,0};
		//System.out.println(ar[5]);
		try
		{
		int arr=ar[0]/ar[4];
		System.out.println("this is working"+arr);
		System.out.println(ar[10]);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("kuch btna v pagal");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("make it in the bond");
		}
       System.out.println("bye");
	}

}
