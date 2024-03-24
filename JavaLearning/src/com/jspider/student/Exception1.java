package com.jspider.student;

public class Exception1 {

	public static void main(String[] args) {
		int a=10,b=0, c;
		try
		{
		c=a/b;
		System.out.println("it is working");
		}
		catch(ArithmeticException e)
		{
			System.out.println("pls check the code ");
		}
		System.err.println("bye");
	}

}
