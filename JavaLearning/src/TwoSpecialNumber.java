import java.util.*;
public class TwoSpecialNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	System.out.println("enter the number: ");
	int n=sc.nextInt();
		int rem=n%10;
		int f=n/10;
		int sum=rem+f+rem*f;
		if(sum==n)
		System.out.println("special : "+n);
		else
			System.out.println("not special :"+n);
	}

}
