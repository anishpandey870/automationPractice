import java.util.*;
public class CountOddEvenNum {

	public static void main(String[] args) {

     Scanner sc=new Scanner (System.in);
     int n=sc.nextInt();
      int ec=0;
      int oc=0;
      while(n>0) {
    	  int rem=0;
    	  rem=n%10;
    	  if(rem%2==0)
    		  ec++;
    	  else
    		  oc++;
    	  n=n/10;
      }
      System.out.println("even count"+ec);
      System.out.println("odd count"+oc);
	}

}
