package practice;

public class PalindromCheck {
    public static void isPalindrom(int n) {
        int temp = n, sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("palimdrom");
        } else {
            System.out.println("not");
        }
    }

    public static void main(String[] args) {
        int n = 74657;
        isPalindrom(n);
    }
}
