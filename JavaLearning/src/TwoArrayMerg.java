import java.util.*;
public class TwoArrayMerg {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int[] a=new int[n1];
		int[] b=new int[n2];
		int n3=n1+n2;
		int[] c=new int[n3];
		System.out.println("enter first array element");
		for(int i=0;i<a.length;i++)
		
			a[i]=sc.nextInt();
		
		System.out.println("enter 2nd array element");
		for(int i=0;i<b.length;i++)
	
			b[i]=sc.nextInt();

		for(int i=0;i<a.length;i++)
	
			c[i]=a[i];
		for(int i=0;i<b.length;i++)
			c[n1+i]=b[i];
			
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
		
			
	}

}
