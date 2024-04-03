package org.example.execptingHandling;

public class ExceptionTest {
    public static int dividedByZero(int a,int b){
        int i =a/b;
        return i;
    }
    public static int computerDivision(int a,int b){
        int res=0;
        try {
            res =dividedByZero(a,b);
        }catch (NumberFormatException e){
            System.out.println(e);
        }
        return res;
    }

    public static void main(String[] args) {
        int a=10,b=0;
        try {
            int i=computerDivision(a,b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
