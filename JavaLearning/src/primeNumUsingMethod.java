import java.util.*;
  public class primeNumUsingMethod
  {
	  static boolean isPrime(int x)
	  {
		  for(int i=2;i<=x/2;i++)
		  {
			  if(x%i==0)
				  return false;
		  }
		  return true;
	  }
	  public static void main(String []args)
	  {
		  Scanner sc=new Scanner(System.in);
		  //int n=sc.nextInt();
		  System.out.print("enter the number : ");
		  int m=sc.nextInt();
		  for(int i=1;i<=m;i++)
		  {
			  boolean rs=isPrime(i);
			 if(rs==true)
				 System.out.println(i);
			  
		  }
		 // if(rs==true)
		//	  System.out.println(i);
	  }
  }