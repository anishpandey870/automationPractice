import java.util.*;
public class CountPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int c=0;
		while(n!=0)
		{
			//int r=n%10;
			for(int i=1;i<=n;i++)
			{
				int r=n%10;
				if(r%i==0)
					count++;
				c=count+1;
				n=n/10;
			}
			c--;
			//n=n/10;
			//if(count==2)
			//System.out.println(c);
			}
			System.out.println(c);

	}

}
