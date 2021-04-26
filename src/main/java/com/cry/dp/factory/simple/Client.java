package com.cry.dp.factory.simple;

public class Client {
    public static void main(String[] args) {
//        CarFactory carFactory = new CarFactory();
        Car car = CarFactory.getCar("大众");
        car.name();
    }
}
