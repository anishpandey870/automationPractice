import java.util.*;
public class MathodFebbino {
	public static int Febbin(int n){
		int a=0,b=1;
		int c=0;
		a=b;
		b=c;
		c=a+b;
		System.out.println("enter number");
		System.out.println(b);
		return c;
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int rs=Febbin(5);
		System.out.println(rs);

	}

}
