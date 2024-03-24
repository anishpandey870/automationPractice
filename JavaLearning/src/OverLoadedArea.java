
public class OverLoadedArea {

	static int isArea(int l,int b)
	{
		int ar=l*b;
		return ar;
	}
	static double isArea(double radius)
	{
		double ar=Math.PI*radius*radius;
		return ar;
	}
	public static void main(String[] args) {
		int l=10,b=20;
		double r=2.5;
		double rs=isArea(r);
		System.out.println(rs);

	}

}
