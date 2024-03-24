import java.util.*;
public class ArmStrongSimple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=0;
	int	temp=n;
		while(n!=0)
		{
			//int temp=n;
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
     
		}
		if(temp==sum)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
