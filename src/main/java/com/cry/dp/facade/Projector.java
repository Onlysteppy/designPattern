package com.cry.dp.facade;

public class Projector {
    public static Projector instance = new Projector();

    private Projector() {
    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector on");
    }

    public void focus() {
        System.out.println("Projector focus");
    }

    public void off() {
        System.out.println("Projector off");
    }
}
