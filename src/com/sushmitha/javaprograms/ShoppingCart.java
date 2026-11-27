package com.sushmitha.javaprograms;

public class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setProductId(101);
        p1.setProductName("Laptop");
        p1.setPrice(55000.00);
        p1.setQuantity(10);

        System.out.println("----- Product 1 Details -----");
        System.out.println("Product ID: " + p1.getProductId());
        System.out.println("Product Name: " + p1.getProductName());
        System.out.println("Price: " + p1.getPrice());
        System.out.println("Quantity: " + p1.getQuantity());

        Product p2 = new Product();
        p2.setProductId(102);
        p2.setProductName("T-shirt");
        p2.setPrice(3000.55);
        p2.setQuantity(3);

        System.out.println("----- Product 2 Details -----");
        System.out.println("Product ID: " + p2.getProductId());
        System.out.println("Product Name: " + p2.getProductName());
        System.out.println("Price: " + p2.getPrice());
        System.out.println("Quantity: " + p2.getQuantity());


    }
}
