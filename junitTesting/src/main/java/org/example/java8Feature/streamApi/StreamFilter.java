package org.example.java8Feature.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Mahesh",null,"Somu",null,"Akhil");
       List<String> result= list.stream().filter(p->p!=null).collect(Collectors.toList());
       System.out.println(result);
    }
}
