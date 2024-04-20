package practice;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1,String s2){
        String st1=s1.toLowerCase();
        String st2=s2.toLowerCase();

        if(st1.length()!=st2.length()){
            return false;
        }
        char[] c1=st1.toCharArray();
        char[] c2=st2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

       return Arrays.equals(c1,c2);
    }
    public static void main(String[] args) {
        String s1="Race";
       String s2="Care";

        boolean res=isAnagram(s1,s2);
      if(res){
          System.out.println("Anagram");
      }else {
          System.out.println(" not Anaggram");
      }
    }
}
