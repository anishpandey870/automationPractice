import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
	Scanner sc= new Scanner	(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	boolean rs=isArmstrong(n);
	if(rs==true)
		System.out.println("number is armstrong :"+rs);
	else
		System.out.println("number is  not armstrong :"+rs);
	
	}
	public static boolean isArmstrong(int x)
	{
		int sum=0,temp=x;
		int count=doCount(x);
		while(x !=0)
		{
			int rem=x%10;
			sum=sum+isPow(rem,count);
			x=x/10;
		}
		return sum==temp;
	}
	public static int doCount(int y)
	{
		int count=0;
		while(y !=0)
		{
			y=y/10;
			count++;
		}
		return count;
	}
	public static int isPow(int b, int p)
	{
		int power=1;
		for(int i=1;i<=p;i++)
		{
			power=b*power;
		}
		return power;
	}

}
