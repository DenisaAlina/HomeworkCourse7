package com.fasttrack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(27, "Denisa", false);
        Person person2 = new Person(22, "Alina", false);
        Person person3 = new Person(32, "Daniela", true);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


        Product product1 = new Product("Apple", 10.0,20, "fruit");
        Product product2 = new Product("Grapes", 15.0,15, "fruit");
        Product product3 = new Product("Flour", 5.0,50, "food");

        Scanner scanner = new Scanner(System.in);
        String category = scanner.next();

        System.out.println(product1.isCategory(category));
        System.out.println(product2.isCategory(category));
        System.out.println(product3.isCategory(category));

        System.out.println(product1.hasStock());
        System.out.println(product2.hasStock());
        System.out.println(product3.hasStock());

        System.out.println(product1.getName() + " has price : "+ product1.getPrice() + " and stock: "+ product1.getQuantity() + " and is from category: "+ product1.getCategory());
        System.out.println(product2.getName() + " has price : "+ product2.getPrice() + " and stock: "+ product2.getQuantity() + " and is from category: "+ product2.getCategory());
        System.out.println(product3.getName() + " has price : "+ product3.getPrice() + " and stock: "+ product3.getQuantity() + " and is from category: "+ product3.getCategory());
    }
}
