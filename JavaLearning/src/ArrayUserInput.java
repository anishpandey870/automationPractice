import java.util.Scanner;
public class ArrayUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new  int[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("enter array element: ");
		  arr[i]=sc.nextInt();
		  System.out.println("print index number"+arr[i]);
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
