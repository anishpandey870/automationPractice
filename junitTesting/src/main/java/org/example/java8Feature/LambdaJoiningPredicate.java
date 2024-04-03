package org.example.java8Feature;

import java.util.function.Predicate;
//p1=check number is even
//p2--check greater than 5
public class LambdaJoiningPredicate {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,10,20};
        Predicate<Integer> p1=i->(i%2==0);
        Predicate<Integer> p2=i->(i>5);
        for(int n:ar){
            //if(p1.test(n) && p2.test(n)){
            if(p1.and(p2).test(n)){
                System.out.print(n+" ");
            }
        }
    }
}
