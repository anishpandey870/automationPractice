package com.jspider.student;

class A{
	void m(){
		System.out.println("hi");
	}
}
class B extends A{
	void m2() {
		System.out.println("bye");
	}
}
public class Main {
	public static void main(String[] args) {
		B b=new B();
		b.m();
		b.m2();
	}

}
