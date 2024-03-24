import java.util.*;
public class ArrayAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of product :");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{ 
			System.out.print("enter the price: ");
			ar[i]=sc.nextInt();
			
		} 
		 int sum=0;
		 float avg=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=(sum+ar[i]);
            avg= sum/n;
		}
       System.out.println(avg);
	}

}
