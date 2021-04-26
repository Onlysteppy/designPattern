package com.cry.dp.builder.v1;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.build(new Worker());
    }
}
