package com.jspider.student;

public class Cloth {

	int size;
	String color;
	String brand;
	double price;
	Cloth(int size){
		this.size=size;
	}
	Cloth(int size, String color){
		this(size);
		this.color=color;
	}
	Cloth(int size, String color,String brand){
		this(size,color);
		this.brand=brand;
	}
	Cloth(int size,String color,String brand,double price){
		this(size,color,brand);
		this.price=price;
	}
	void details() {
		System.out.println(size);
		System.out.println(color);
		System.out.println(brand);
		System.out.println(price);
	}
	public static void main(String[] args) {
		Cloth c=new Cloth(38,"red","woodland",9489);
		c.details(); 
		Cloth c2=new Cloth(38);
		c2.details();

	}

}
