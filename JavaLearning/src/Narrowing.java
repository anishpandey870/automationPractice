
public class Narrowing {

	public static void main(String[] args) {
		int a=10;
		byte b=(byte)a;
		short c=(short)b;
		float d=2.50f;
		int e=(int)d;
		double f=39.35d;
		short g=(short)f;
		long l=(long)f;
		float m=(float)f;
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		System.out.println(g);
		System.out.println(l);
		System.out.println(m+" "+"convert into float");

	}

}
