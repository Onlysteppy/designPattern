package com.cry.dp.proxy.v1;

import java.util.Random;

/**
 * 1、坦克可以移动，发出咔嚓咔嚓的声音
 */
public class Tank implements Movable{

    public void move() {
        System.out.println("Tank moving claclacla...");

        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}
interface Movable{
    void move();
}