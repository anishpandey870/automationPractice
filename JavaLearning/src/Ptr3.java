import java.util.*;
public class Ptr3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++ )
		{
			for(int j=n;j>=1 ;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
