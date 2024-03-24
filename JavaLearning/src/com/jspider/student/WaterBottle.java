package com.jspider.student;

public class WaterBottle {
	int quantity;
	String color;
	WaterBottle(int quantity,String color){
		this.quantity=quantity;
		this.color=color;
	}
	void detailsOfWaterBottle() {
		System.out.println(quantity);
		System.out.println(color);
	}

	public static void main(String[] args) {
		WaterBottle b=new WaterBottle(5,"red");
		//b.WaterBottle(5,"red");
		b.detailsOfWaterBottle();

	}

}
