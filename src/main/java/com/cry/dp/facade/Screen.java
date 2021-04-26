package com.cry.dp.facade;

public class Screen {
    public static Screen instance = new Screen();

    private Screen() {
    }
    public static Screen getInstance() {
        return instance;
    }
    public void on() {
        System.out.println("Screen on");
    }

    public void up() {
        System.out.println("Screen up");
    }
    public void down() {
        System.out.println("Screen down");
    }
}
