package practice;

public class ArrayRightRotation {

    public static void rightRotateArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j, lastElement;
            lastElement = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = lastElement;
        }
    }

    public static void leftRotateArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j, firstElement;
            firstElement = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = firstElement;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //output 55 66 11 22 33 44
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12};
        int temp[]= {2, 4, 6, 8, 10, 12};
        int n = 2;

        System.out.println("Given array is: ");
        printArray(numbers);

        rightRotateArray(numbers, n);
        System.out.println("Array after " + n + " right rotations: ");
        printArray(numbers);

        leftRotateArray(temp, n);
        System.out.println("Array after " + n + " left rotations: ");
        printArray(temp);


    }
}
