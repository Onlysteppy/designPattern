package com.cry.dp.factory.method;

public class Client {
    public static void main(String[] args) {
//        CarFactory carFactory = new CarFactory();
        DaZongFactory daZongFactory = new DaZongFactory();
        Car car = daZongFactory.getCar();
        car.name();
    }
}
