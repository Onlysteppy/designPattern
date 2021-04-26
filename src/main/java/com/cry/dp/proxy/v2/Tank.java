package com.cry.dp.proxy.v2;

import java.util.Random;

/**
 * 2、在坦克可以移动发出咔嚓咔嚓的声音的基础上，打印move方法执行了多少时间
 */
public class Tank implements Movable{
    public void move() {
        long startTime=System.currentTimeMillis();
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("time="+(endTime-startTime));
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.move();
    }
}
interface Movable{
    void move();
}