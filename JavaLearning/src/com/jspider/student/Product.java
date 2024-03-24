package com.jspider.student;

public class Product {
	int id;
	String pname;
	double price;
	Product(int id, String pname){
		this.id=id;
		this.pname=pname;
	}
	Product(int id,String pname,double price){
		this(id,pname);
	  this.price=price;
	}
	void details() {
		System.out.println(id);
		System.out.println(pname);
		System.out.println(price);
	}

	public static void main(String[] args) {
		Product p=new Product(789,"shirt",2000);
		//Product p2=new Product(477,"pant");
		p.details();
       // p2.details();
	}

}
