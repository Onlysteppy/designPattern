package com.cry.dp.factory.method;

public class TeslaFactory implements CarFacotry {
    public TeslaCar getCar() {
        return new TeslaCar();
    }
}
