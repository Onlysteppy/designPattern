package com.cry.dp.facade;

public class Stereo {
    public static Stereo instance = new Stereo();

    private Stereo(){}
    public static Stereo getInstance() {
        return instance;
    }
    public void on() {
        System.out.println("Stereo on");
    }
    public void up() {
        System.out.println("Stereo up");
    }
    public void off() {
        System.out.println("Stereo off");
    }
}
