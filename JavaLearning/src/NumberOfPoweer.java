import java.util.*;
public class NumberOfPoweer {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("eneter base number");
		int n=sc.nextInt();
		System.out.println("entter exponent number");
		int p=sc.nextInt();
		int power=1;
		for(int i=1;i<=p;i++)
		{
			//int power=1;
			power=n*power;
			//System.out.println(power);
		}
		System.out.println(power);
}

}
