import java.util.Scanner;
public class ArrayMinElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int min=ar[0];
		for(int j=0;j<ar.length;j++)
		{
			if(min>ar[j])
				min=ar[j];
		}
		System.out.println(min);

	}

}
