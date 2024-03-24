
public class LaptopMathod {
	String brand;
	int ram;
	double price;
	public void setDetails(String brand,int ram,double price) {
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}
	public void details() {
		System.out.println(brand);
		System.out.println(ram);
		System.out.println(price);
	}

	public static void main(String[] args) {
		LaptopMathod l=new LaptopMathod();
		l.setDetails("hp",8,4000);
		l.details();

	}

}
