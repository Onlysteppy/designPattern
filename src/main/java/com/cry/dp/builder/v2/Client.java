package com.cry.dp.builder.v2;

public class Client {
    public static void main(String[] args) {
        Woker woker = new Woker();
        Product product1 = woker.getProduct();
        System.out.println(product1);
        Product product = woker.buildA("薯条").buildC("汉堡").getProduct();

        System.out.println(product.toString());
    }
}
