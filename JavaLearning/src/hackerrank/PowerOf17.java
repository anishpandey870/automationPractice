package hackerrank;

import java.io.*;
import java.util.*;

public class PowerOf17 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int exp=sc.nextInt();
       long res=1;
//        while(exp>0){
//             res =res*17;
//            System.out.println(res);
//            exp--;
//        }   
       for(int i=1;i<=exp;i++) {
    	   res*=17;
    	   System.out.println(res);
       }
    }
}