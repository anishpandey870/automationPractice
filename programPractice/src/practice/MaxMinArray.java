package practice;

public class MaxMinArray {
    public static void maxMinArray(int[] ar){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] ar={1,2,3,45,5,6};
        maxMinArray(ar);
    }
}
