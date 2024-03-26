package org.example;

public class MaxArray {
    public static int maxArr(int[] ar){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(max<ar[i]){
                max=ar[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int ar[]={2,3,4,5};
        System.out.println(MaxArray.maxArr(ar));
    }
}
