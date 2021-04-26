package com.cry.dp.facade;

public class PopCorn {
    public static PopCorn instance = new PopCorn();

    private PopCorn() {
    }

    public static PopCorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("PopCorn on");
    }

    public void pop() {
        System.out.println("PopCorn pop");
    }

    public void off() {
        System.out.println("PopCorn off");
    }
}
