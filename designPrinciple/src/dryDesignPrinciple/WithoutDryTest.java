package dryDesignPrinciple;

import java.util.Scanner;

// here we are finding x^3 and y^5
public class WithoutDryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        //for x
        int ans1 = 1;
        for (int i = 1; i <= 3; i++) {
            ans1 = ans1 * x;
        }
        System.out.println(ans1);

        //for y
        int ans2 = 1;
        for (int i = 1; i <= 3; i++) {
            ans1 *= y;
        }
        System.out.println(ans2);
    }
}
