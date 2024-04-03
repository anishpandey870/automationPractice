package org.example.java8Feature.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                '}';
//    }
}
public class StreamProductMain {
    public static void main(String[] args) {
        ArrayList<Product> productList =new ArrayList<>();
        productList.add(new Product(12,"Laptop",20000f));
        productList.add(new Product(33,"Phone",10000f));
        productList.add(new Product(12,"Bag",500f));
        productList.add(new Product(12,"monitor",15000f));

//      List<Product> filterProduct=  productList.stream().filter(p->p.price>1000)
//                .collect(Collectors.toList());
//      System.out.println(filterProduct);
        //using forEach
        productList.stream()
                .filter(p->p.price>1000)
                .forEach(product -> System.out.println(product.price));
    }
}
