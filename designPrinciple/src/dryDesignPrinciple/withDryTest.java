package dryDesignPrinciple;

import java.util.Scanner;
// here we are using dry principle
public class withDryTest {
    public int calPow(int base, int pow){
        int power=1;
        for (int i=1;i<=pow;i++){
            power=power*base;
        }
        return power;
    }

    public static void main(String[] args) {
        withDryTest dryTest=new withDryTest();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int pow= sc.nextInt();
        System.out.println("this is for x :"+dryTest.calPow(x,pow));
       System.out.println("this is for y :"+ dryTest.calPow(y,pow));



    }

}
