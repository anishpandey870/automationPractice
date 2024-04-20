package practice;

public class ArrayRotation {
    public static int[] rotateLeft(int[] arr, int positions) {
        int length = arr.length;
        int[] rotatedArr = new int[length];
        for (int i = 0; i < length; i++) {
            int newPosition = (i + positions) % length;
            rotatedArr[i] = arr[newPosition];
        }
        return rotatedArr;
    }

    public static int[] rotateRight(int[] arr, int positions) {
        int length = arr.length;
        int[] rotatedArr = new int[length];
        for (int i = 0; i < length; i++) {
            int newPosition = (i - positions + length) % length;
            rotatedArr[i] = arr[newPosition];
        }
        return rotatedArr;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int positions = 2;

        int[] rotatedLeft = rotateLeft(originalArray, positions);
        System.out.println("Array after rotating left by " + positions + " positions:");
        printArray(rotatedLeft);

        int[] rotatedRight = rotateRight(originalArray, positions);
        System.out.println("Array after rotating right by " + positions + " positions:");
        printArray(rotatedRight);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
