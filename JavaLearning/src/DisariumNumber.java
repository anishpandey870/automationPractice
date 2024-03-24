import java.util.*;
public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		boolean rs=isDisarium(n);
		if(rs==true)
			System.out.println("is disarium number : "+rs);
		else
			System.out.println("not disarium number :"+rs);
	}
	public static boolean isDisarium(int x)
	{
		int sum=0, temp=x;
		int count=doCount(x);
		while(x!=0)
		{
			int rem=x%10;
			sum=sum+isPow(rem,count);
			x=x/10;
			count--;
		}
		return sum==temp;
	}
	public static int doCount(int y)
	{
		int count=0;
		while(y!=0)
		{
			y=y/10;
			count++;
		}
		return count;
	}
	public static int isPow(int b,int p)
	{
		int pw=1;
		for(int i=1;i<=p;i++)
		{
			pw=b*pw;
		}
		return pw;
	}

}
