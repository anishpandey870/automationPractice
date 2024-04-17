package practice;

public class ReverseStringWithoutInbuilt {
    public static String reverseString(String st){
        char ch[]=st.toCharArray();
        String rev="";
        for(int i= ch.length-1;i>=0;i--){
            rev=rev+ch[i];
        }
       return rev;
    }

    public static void main(String[] args) {
        String st="Anish";
        String res=reverseString(st);
        System.out.println(res);
    }
}
