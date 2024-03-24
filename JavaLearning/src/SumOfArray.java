import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size :");
		int size=sc.nextInt();
		int ar[]=new int[size];
	
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("enter the element :");
			ar[i]=sc.nextInt();
		}
		int sum=0,product=1;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
			product=product*ar[i];
			//System.out.println("sum of array is :"+sum);
		}
		System.out.println("sum of array is :"+sum);
		System.out.println("product of the element :"+product);
	}

}
