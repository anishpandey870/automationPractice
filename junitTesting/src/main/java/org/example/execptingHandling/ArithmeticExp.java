package org.example.execptingHandling;

public class ArithmeticExp {
    public static void main(String[] args) {
        int a=15,b=0,c;
        try {
            c=a/b; //throw expection
            System.out.println(b);
        }catch (ArithmeticException execption){
          //  System.out.println(execption);
            System.out.println(a/(b+3)); //here resolve the expection
        }

    }
}
