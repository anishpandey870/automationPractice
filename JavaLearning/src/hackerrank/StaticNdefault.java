package hackerrank;

public class StaticNdefault {
	public static void main(String[] args) {
		Anonymous a = new Anonymous() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("show method");
			}
			public  void prints() {
				System.out.println("ram");
			}
		};
		a.show();
		a.prints();
		
	}
}
