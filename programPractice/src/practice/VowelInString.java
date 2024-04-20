package practice;
//Check Vovels in String
public class VowelInString {
    public static void vowelCheck(String s){
        String str=s.toLowerCase();
        for(int i=0;i<str.length();i++){
          char  ch=str.charAt(i);
           if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
               System.out.print(ch+" ");
           }
        }
    }
    public static void main(String[] args) {
        String st="this for you";
        vowelCheck(st);
    }
}
