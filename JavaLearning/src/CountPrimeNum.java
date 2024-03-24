import java.util.*;
public class CountPrimeNum {
	static boolean isPrime(int y)
	{
		for(int i=2;i<=y/2;i++)
		{
			if(y%i==0)
				return false;	
		}
		return true;
	}
	static int isCount(int x)
	{
		int count=0;
		for(int i=1;i<=x;i++)
		{
		boolean rs=isPrime(i);
		if(rs)
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pc=isCount(n);
			System.out.println(n+"----->"+pc);
				
	}

}
