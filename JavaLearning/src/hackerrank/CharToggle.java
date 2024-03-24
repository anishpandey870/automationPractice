package hackerrank;

import java.io.*;
import java.util.*;

public class CharToggle {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if((c>=97 && c<=122)|| (c>=65 && c<=90)){
           if(Character.isUpperCase(c)){
               c=Character.toLowerCase(c);
           } else{
                c=Character.toUpperCase(c);
           }
            c-=2;
             if((c>=97 && c<=122)|| (c>=65 && c<=90)){
                  System.out.println(c);
             }else{
            System.out.println("Sorry");
        }
            
        }else{
            System.out.println("No alphabet");
        }
        
    }
}