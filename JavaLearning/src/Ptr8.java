import java.util.Scanner;
public class Ptr8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++ )
		{
			for(int j=1;j<=i ;j++)
			{
				System.out.print(i%2+" ");
			}
			System.out.println();
		}

	}

}

