import java.util.*;

public class febbino {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter num");
	int n= sc.nextInt();
	int a=0;
	int b=1;
	int c=1;
	for(int i=1;i<=n;i++) {
		System.out.println(a);
		// c=a+b;
		a=b;
		b=c;
		c=a+b;
		//System.out.println(c);
		
		
	}

	}

}
