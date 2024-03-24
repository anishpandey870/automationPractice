import java.util.*;
public class ArrayMaxElement {
	static int isMax(int x[])
	{
		int max=0;
		for(int i=0;i<x.length;i++)
		{
			if(max<x[i])
				max=x[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}

		int rs=isMax(ar);
		
			System.out.println(rs);
	}

}
