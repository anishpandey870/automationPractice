import java.util.*;
public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		boolean rs =isPalindrom(n);
		if(rs==true)
			System.out.println("number is palindrom : "+rs);
		else
			System.out.println("number is not palindrom :"+rs);
		}
	public static boolean isPalindrom(int x) {
		int sum=0,temp=x;
		while(x!=0)
		{
		int rem=x%10;
		sum=sum*10+rem;
		x=x/10;
		}
		return sum==temp;
	}

}
