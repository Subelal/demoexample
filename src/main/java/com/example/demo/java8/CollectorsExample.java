package com.example.demo.java8;


import java.util.ArrayList;
import java.util.Arrays;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class CollectorsExample {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"dell",25000f));
        productList.add(new Product(2,"HP",21000f));
        productList.add(new Product(3,"lenova",20000f));
        productList.add(new Product(4,"sumsang",20000f));
        productList.add(new Product(5,"realme",27000f));
        productList.add(new Product(6,"redmi",29000f));

       Long noOfElement =
               productList.stream().collect(Collectors.counting());

        System.out.println(noOfElement);

          }

    }
