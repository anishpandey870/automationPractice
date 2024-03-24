import java.util.*;
public class AP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		int term=a;
		for(int i=0;i<n;i++)
		{
			 System.out.print(term+",");
		  term=term+d;
		 // System.out.print(term+",");
		}
	}

}
