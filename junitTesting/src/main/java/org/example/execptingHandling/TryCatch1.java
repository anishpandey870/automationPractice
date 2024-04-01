package org.example.execptingHandling;

public class TryCatch1 {
    public static void main(String[] args) {
        try {
            int arr[]={1,2,3,4,5};
            int ar[]=new int[5];
             ar[5]=30/0;
            System.out.println(arr[10]);//throw exception
        } catch (ArithmeticException e){
                System.out.println("Arithmetic execption");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
