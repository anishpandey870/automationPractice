package OraclePractics;

import java.util.Scanner;

//12345-    contains 5only one time
//345654-    contains 5two times
//55555-    contains 5five times
public class Fav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
//		int n=s.nextInt();
//		 int count=0;
	      for(int i=0;i<t;i++){
	    	  int n=s.nextInt();
	    	  int count=0;
	        while(n>0){
	          if(n%10==5)
	          count++;
	           n=n/10;
	    
	        }
	        System.out.println(count);
	      }
	    //  System.out.println(count);
	}

}
