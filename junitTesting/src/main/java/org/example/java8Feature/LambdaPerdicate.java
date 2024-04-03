package org.example.java8Feature;

import java.util.function.Predicate;

public class LambdaPerdicate {
    public static void main(String[] args) {
        Predicate<Integer> p=i->(i>10);
        System.out.println(p.test(20));
        //checking the length of string using predicate
        Predicate<String> pr=str ->(str.length()>4);
        System.out.println(pr.test("Bridge"));
    }
}
