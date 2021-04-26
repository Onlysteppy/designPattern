package com.cry.dp.builder.v1;


//指挥构建一个工程
public class Director {
    public Product build(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
