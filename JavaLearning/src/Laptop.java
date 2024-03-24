
public class Laptop {
	String brand;
	String processor;
	int ram;
	double price;
	public void details() {
		System.out.println("company is :"+brand);
		System.out.println("laptop is :"+processor);
		System.out.println("laptop is :"+ram);
		System.out.println("lapto price is :"+price);
	}
	
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.brand="leniov";
		l.processor= "intel";
		l.ram=8;
		l.price=50000;
		l.details();

	}

}
