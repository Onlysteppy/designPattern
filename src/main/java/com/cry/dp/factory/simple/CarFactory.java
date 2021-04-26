package com.cry.dp.factory.simple;


/**
 * 静态工厂模式
 */
public class CarFactory {
    public static Car getCar(String brand) {
        if ("奥迪".equals(brand)) {
            return new AudiCar();
        } else if ("大众".equals(brand)) {
            return new DaZongCar();
        } else if ("特斯拉".equals(brand)) {
            return new TeslaCar();
        } else {
            return null;
        }
    }
}
