import java.util.Scanner;
public class ArrayMaxAndMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array :");
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("enter array element: ");
			ar[i]=sc.nextInt();
		}
		int max=ar[0],min=ar[0];
		for(int j=0;j<ar.length;j++)
		{
			if(max<ar[j])
				max=ar[j];
			else if(min>ar[j])
				min=ar[j];
				
		
		}
		System.out.println(max+" ");

	}

}
