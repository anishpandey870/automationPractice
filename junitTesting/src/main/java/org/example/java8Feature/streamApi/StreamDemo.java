package org.example.java8Feature.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> evenList = new ArrayList<>();
        //without stream
//        for(int lis:li){
//            if(lis%2==0){
//                System.out.print(lis+" ");
//            }
//        }
        //with stream
//        evenList = li.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenList);
        //using forEach() to print the data
         li.stream().filter(p -> p % 2 == 0).forEach(n->System.out.println(n));
    }
}
