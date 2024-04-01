package org.example.execptingHandling;

public class MultipleBlock {
    public static void main(String[] args) {
        try {
            int arr[]=new int[5];
            arr[4]=30/0;
        }
//        catch (Exception e){
//            System.out.println("this parent class"+e);
//        }
        catch(ArithmeticException ex){
            System.out.println("Arithmetic execption ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
