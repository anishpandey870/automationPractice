package practice;

public class ArraySecondLargest {
    public static int secondLargest(int ar[]) {
        int max = Integer.MIN_VALUE;
        int secandMax = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                secandMax = max;
                max = ar[i];
            } else if (ar[i] > secandMax && ar[i] != max) {
                secandMax = ar[i];
            }
        }
        return secandMax;
    }

    public static void main(String[] args) {
        int ar[] = {1, 3, 4, 6, 2};
        int res = secondLargest(ar);
        System.out.println(res);
    }
}
