import java.util.*;
public class ArrHighestLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int st=sc.nextInt();
		int a[]=new int[st];
		String arr[]=new String[st];
		int z=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
			a[i]=arr[i].length();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
		     {
			   if(a[i]>a[j])
			    {
				z=i;
			    }
		     }	
		
		}
		System.out.println(arr[z]);
	

	
	

}

}
