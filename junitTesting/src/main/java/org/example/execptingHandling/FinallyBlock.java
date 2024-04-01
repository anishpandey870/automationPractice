package org.example.execptingHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int a=10/2;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("this finally block");
        }
    }
}
