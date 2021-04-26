package com.cry.dp.facade;

public class DVDPlayer {

    //使用单例模式，使用饿汉式
    public static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {

    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVDPlayer on");
    }
    public void play(){
        System.out.println("DVDPlayer play");
    }
    public void pause(){
        System.out.println("DVDPlayer pause");
    }
    public void off() {
        System.out.println("DVDPlayer off");

    }
}
