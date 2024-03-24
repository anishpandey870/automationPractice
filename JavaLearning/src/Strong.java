import java.util.*;

public class Strong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ;");
		int n=sc.nextInt();
		boolean rs=isStrong(n);
		if(rs==true)
			System.out.println(rs);
		else
			System.out.println(rs);
	}
		public static boolean isStrong(int x)
		{
			int sum=0,temp=x;
			while(x!=0)
			{
			int r=x%10;
			sum=sum+isFact(r);
			x=x/10;
			}
			return sum==temp;
		}
		public static int isFact(int z)
		{
			int fc=1;
			for(int i=1;i<=z;i++)
			{
				fc=fc*i;
			}
			return fc;
		}
		
		
	}


