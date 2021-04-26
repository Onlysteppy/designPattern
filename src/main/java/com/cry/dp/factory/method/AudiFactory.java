package com.cry.dp.factory.method;


public class AudiFactory implements CarFacotry {
    public Car getCar() {
        return new AudiCar();
    }
}
