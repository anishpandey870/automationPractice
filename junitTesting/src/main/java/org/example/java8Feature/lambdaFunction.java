package org.example.java8Feature;

import java.util.function.Function;

public class lambdaFunction {
    public static void main(String[] args) {
        Function<Integer,Integer> f=n->n*n;
       System.out.println( f.apply(5));
       //length of string
        Function<String,Integer> fn=str -> str.length();
        System.out.println(fn.apply("hello"));
    }

}
