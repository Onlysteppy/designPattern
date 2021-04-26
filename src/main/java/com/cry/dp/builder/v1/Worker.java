package com.cry.dp.builder.v1;


public class Worker extends Builder {
    private Product product;

    public Worker() {
        this.product = new Product();
    }

    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    void buildB() {
        product.setBuildA("钢筋工程");
        System.out.println("钢筋工程");
    }

    void buildC() {
        product.setBuildA("铺电线");
        System.out.println("铺电线");
    }

    void buildD() {
        product.setBuildA("粉刷");
        System.out.println("粉刷");
    }

    Product getProduct() {
        return this.product;
    }
}
