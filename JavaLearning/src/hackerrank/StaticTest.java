package hackerrank;

class A{
	public static void show() {
		System.out.println("syama");
	}
}
public class StaticTest {
	public static void show() {
		System.out.println("ram");
	}
	public static void main(String[] args) {
		A a=new A();
		
		a.show();

	}

}
