import java.util.*;
public class Gp {

	public static void main(String[] args) {
		int n=5;
		int a=2;
		Scanner sc=new Scanner(System.in);
		int  r=sc.nextInt();
		int term=a;
		for(int i=0;i<n;i++)
		{
			System.out.print(term+",");
			term=term*r;
			//System.out.print(term+",");
		}

	}

}
