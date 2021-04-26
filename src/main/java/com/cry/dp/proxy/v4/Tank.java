package com.cry.dp.proxy.v4;


import java.util.Random;

/**
 *
 */
public class Tank implements Movable {
    public void move() {
        System.out.println("Tank4 moving claclacla...");

        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TankTimeProxy tankTimeProxy = new TankTimeProxy(new Tank());
        tankTimeProxy.move();
    }
}

class TankTimeProxy implements Movable {
    private Tank tank;

    public TankTimeProxy(Tank tank) {
        this.tank = tank;
    }

    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

interface Movable {
    void move();
}
