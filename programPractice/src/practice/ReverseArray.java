package practice;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
    for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
    }
    }
    public static void rArray(int ar[]){
        int startLength=0;
        int endLength=ar.length-1;
        while (startLength<endLength){
            int temp=ar[startLength];
            ar[startLength]=ar[endLength];
            ar[endLength]=temp;
            startLength++;
            endLength--;
        }
    }
    static void print(int ar[]){
        for (int i=0;i< ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int ar[]={2,4,5,6,7};
       // reverseArray(ar);

        //using swap number
        // Print original array
        System.out.println("Original array:");
        print(ar);
        // Reverse the array
      //  rArray(ar);
        // Print reversed array
        System.out.println("Reversed array:");
        print(ar);
    }
}
