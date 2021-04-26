package com.cry.dp.facade;

public class TheaterLight {
    public static TheaterLight instance = new TheaterLight();

    private TheaterLight() {
    }
    public static TheaterLight getInstance() {
        return instance;
    }
    public void on() {
        System.out.println("TheaterLight on");
    }

    public void bright() {
        System.out.println("TheaterLight bright");
    }

    public void dim() {
        System.out.println("TheaterLight dim");
    }

    public void off() {
        System.out.println("TheaterLight off");
    }
}
