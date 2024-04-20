package practice;

// Print ASCII Values of Character String A -> 65
//Increment Character by one :- A -> A+1 -> B

public class ASCIIValueOFCharA {
    public static int asciiCheck(char ch){
        int n=(int)ch;
        System.out.println(n);
        n++;
        return n;
    }
    public static void main(String[] args) {
        char ch='A';
       int re= asciiCheck(ch);
        System.out.println((char)re);
    }
}
