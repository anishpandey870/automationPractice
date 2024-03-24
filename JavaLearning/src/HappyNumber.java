import java.util.*;
public class HappyNumber {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter number");
		 int n=sc.nextInt();
		 boolean rs=isHappy(n);
		 if(rs==true)
		 System.out.println("is happy number: "+rs);
		 else
			 System.out.println("not happy number"+rs);
	}
	public static boolean isHappy(int x)
	{
		while(x>9)
		{
			int sum=0;
			while(x!=0)
			{
			int rem=x%10;
		    sum=sum+rem*rem;
		    x=x/10;
			}
			x=sum;
		}
		return x==1||x==7;
		
	}

}
