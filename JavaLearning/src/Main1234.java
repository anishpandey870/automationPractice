import java.util.*;
import java.io.*;
public class Main1234 {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int ar[]=new int[n];
      int t=sc.nextInt();
      int fact=1;
      while(t>0)
      {
        for(int i=0;i<ar.length;i++)
        {
          ar[i]=sc.nextInt();
        }
        for(int i=1;i<ar.length;i++)
        {
          fact=fact*ar[i];
        }
        t--;
      }
      System.out.println(fact);
    }
  }