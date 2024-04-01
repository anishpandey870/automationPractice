package org.example.execptingHandling;

public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            //inner block
            try {
                int a=30/0;
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            //other inner try block
            try {
                int ar[]=new int[5];
                ar[5]=4;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("normal flow");
    }
}
