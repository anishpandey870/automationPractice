package practice;

public class CountDigitInInteger {
    public static int countIntegerDigit(int n) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 123;
        int res = countIntegerDigit(n);
        System.out.println(res);
    }
}
