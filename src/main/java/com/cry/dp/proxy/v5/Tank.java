package com.cry.dp.proxy.v5;

import java.util.Random;

public class Tank implements Movable {
    /**
     * 模拟坦克移动了一段儿时间
     */
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TankLogProxy tankLogProxy = new TankLogProxy(new Tank());
        tankLogProxy.move();
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

class TankLogProxy implements Movable {
    private Tank tank;

    public TankLogProxy(Tank tank) {
        this.tank = tank;
    }

    public void move() {
        System.out.println("start moving...");
        tank.move();
        System.out.println("stopped!");
    }
}

interface Movable {
    void move();
}