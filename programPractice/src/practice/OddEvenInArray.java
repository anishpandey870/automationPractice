package practice;

import java.util.Arrays;

//Find Even and Odd Numbers in Array
//Count the Even Numbers in Array
// Print Intreger Numbers Present at Even Location s in Array
//Array sort
public class OddEvenInArray {
    public static void evenArray(int ar[]) {
        int count = 0;
        System.out.println("this is even :");
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] % 2 == 0) {
                System.out.print(ar[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("this is even count:");
        System.out.print(count + " ");
        System.out.println();

    }

    public static void oddArray(int ar[]) {
        System.out.println("this is odd :");
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] % 2 != 0) {
                System.out.print(ar[i] + " ");
            }
        }
        System.out.println();
    }
    public static void sortArray(int ar[]){
        System.out.println("sorted arrya: ");
        for(int i=0;i<ar.length;i++){
            Arrays.sort(ar);
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int ar[] = {1, 15, 10, 3, 11, 5, 6, 7, 8, 9};
        evenArray(ar);
        oddArray(ar);
        sortArray(ar);
    }
}
