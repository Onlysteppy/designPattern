package com.cry.dp.proxy.v3;

import java.util.Random;

/**
 * 3、对proxy那段方法进行抽取
 */
public class Tank implements Movable {
    public void move() {
        System.out.println("Tank2 moving claclacla...");

        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank2 tank2 = new Tank2();
        tank2.move();
    }
}

class Tank2 extends Tank {
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}

interface Movable {
    void move();
}
