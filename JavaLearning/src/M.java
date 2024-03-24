import java.util.*;
public class M {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     int fact=1;
     for(int i=0;i<n;i++)
     {
    	 a[i]=sc.nextInt();
     }
     for(int i=1;i<n;i++)
     {
    	 fact=fact*a[i];
     }
     System.out.println(fact);
	}

}
