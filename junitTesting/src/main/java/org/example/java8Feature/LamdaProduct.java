package org.example.java8Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LamdaProduct {
    public static void main(String[] args) {
        List<Product> li = new ArrayList<>();
        li.add(new Product(22, "monitor", 22000f));
        li.add(new Product(23, "keyboard", 200.0f));
        li.add(new Product(24, "Board", 1200f));
        //sort the data based on name
        Collections.sort(li, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p : li) {
            //   System.out.println(p.id + " " + p.name + " " + p.price);
        }
        //filter the data based on price
        Stream<Product> filterData = li.stream().filter(product -> product.price > 300);
        filterData.forEach(p -> System.out.println(p.name + "-" + p.price));
    }
}
