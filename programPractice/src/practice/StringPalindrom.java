package practice;

public class StringPalindrom {
    public static void stringPalindrom(String st){
        String temp=st;
        String rev="";
        for(int i=st.length()-1;i>=0;i--){
       rev=rev+st.charAt(i);
        }
        System.out.println(rev);
        if(temp.equals(rev)){
            System.out.println("palindrom");
        }else{
            System.out.println("not");
        }
    }

    public static void main(String[] args) {
        String st="madam";
        stringPalindrom(st);
    }
}
