package org.example.java8Feature.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mohit", "sohit", "rina", "mina");
        List<String> finalList = new ArrayList<>();
//        for(String li:list){
//            finalList.add(li.toUpperCase());
//        }
        finalList = list.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(finalList);

        //using map()
        List<Integer> lis = Arrays.asList(2, 3, 4, 5, 6, 7);
        List<Integer> lisMapResult = lis.stream().map(x -> x + 10).collect(Collectors.toList());
        System.out.println(lisMapResult);

        //using flatMap()
        List<Integer> li1 = Arrays.asList(1, 2);
        List<Integer> li2 = Arrays.asList(3, 4);
        List<Integer> li3 = Arrays.asList(5, 6);
        List<List<Integer>> finalLi = Arrays.asList(li1, li2, li3);
        List<Integer> result = finalLi.stream()
                .flatMap(f -> f.stream())
                .collect(Collectors.toList());
        System.out.println(result);

        //using distinct()
        List<String> vehicle=Arrays.asList("car","bus","motercycle","car","cycle","bus","car");
//       List<String> resVehicle= vehicle.stream().distinct().collect(Collectors.toList());
//       System.out.println(resVehicle);
        vehicle.stream().distinct().forEach(n->System.out.println(n));

        //using count()
      long counts=  vehicle.stream().distinct().count();
      System.out.println(counts);

      //using limit()
       List<String> limitList= vehicle.stream().limit(2).collect(Collectors.toList());
       System.out.println(limitList);
    }
}