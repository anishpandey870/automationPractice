package OraclePractics;

import java.util.Scanner;

public class Pattern1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
	int n=1;
    for(int i=1;i<=5;i++){
    	//int x=1;
      for(int j=1;j<=i;j++){
        System.out.print(n+" ");
      }
      System.out.println();
    }
}
}
