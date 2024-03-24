
public class Bottle {
	int quantity;
	String color;

	public Bottle(int quantity,String color) {
		this.quantity=quantity;
		this.color=color;
	}
	public void details() {
		System.out.println("bottle quantity i s:"+quantity);
		System.out.println("bottle color is :"+color);
	}

	public static void main(String[] args) {
		Bottle b= new Bottle(5,"blue");
		b.details();

	}

}
