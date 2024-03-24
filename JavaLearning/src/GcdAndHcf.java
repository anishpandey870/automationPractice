
public class GcdAndHcf {

	static int gcd(int x,int y)
	{
		while(x!=y)
		{
			if(x>y)
				x=x-y;
			else
				y=y-x;
		}
		return x;
	}
	public static void main(String[] args) {
		System.out.println(gcd(8,16));

	}

}
