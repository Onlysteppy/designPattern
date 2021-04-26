package com.cry.dp.factory.method;

public class DaZongFactory implements CarFacotry {
    public Car getCar() {
        return new DaZongCar();
    }
}
