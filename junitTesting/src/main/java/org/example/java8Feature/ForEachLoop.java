package org.example.java8Feature;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> lis= Arrays.asList(2,3,4,5,6);
        lis.forEach((li)->System.out.println(lis));
    }
}
