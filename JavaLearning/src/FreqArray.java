import java.util.*;
public class FreqArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean b[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
			int count=0;
			if(b[i]==false)
			{
				for(int j=1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						b[j]=true;
						count++;
					}
				}
				System.out.println(a[i]+"   "+count);
			}
			else 
				continue;
		}

	}

}
