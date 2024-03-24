package OraclePractics;

import java.io.IOException;
import java.util.Scanner;

public class  PrepByte{
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int rev=0;
     int temp=x;
      while(x>0){
          int rem=x%10;
          rev=rev*10+rem;
        x=x/10;
        //  System.out.print(rem);
        }
    	if(temp==rev)
      System.out.print(rev);
    	else
    	System.out.println("not");
    }
  }