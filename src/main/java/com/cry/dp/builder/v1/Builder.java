package com.cry.dp.builder.v1;

//抽象的建造者
public abstract class Builder {
    abstract void buildA();//地基
    abstract void buildB();//钢筋工程
    abstract void buildC();//铺电线
    abstract void buildD();//粉刷
    abstract  Product getProduct();
}
