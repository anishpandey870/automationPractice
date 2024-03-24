import java.util.*;
	  import java.io.*;
public class PrimeNumBtwNum {

	
	  
	  
	    public static void main(String args[]) throws IOException {
	      
	      Scanner sc=new Scanner(System.in);
	      
	      int T=sc.nextInt();
	      int N=sc.nextInt();
	      int sum=0;
	      int tem=N;
	      while(T>=0){
//	      {int N=sc.nextInt();
//	      int sum=0;
//	      int tem=N;
	       for(int i=1;i<N;i++)
	       {
	         if(N%i==0)
	         {
	           sum=sum+i;
	         }
	       }
	       if(sum==tem){
	         System.out.println("true");
	       }
	         else{
	         System.out.println("false");}
	       T--;
	      }
	      
	    }
	  }
