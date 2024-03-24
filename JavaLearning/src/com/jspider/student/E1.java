package com.jspider.student;

public class E1 {

	private String brand;
	public String getM() {
		return brand;
	}
	void setM(String brand) {
		this.brand=brand;
	}
	public static void main(String[] args) {
		E1 e=new E1();
		e.setM("intel");
		System.out.println(e.getM());

	}

}
