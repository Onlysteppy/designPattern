package com.cry.dp.observe.v8;

import java.util.ArrayList;
import java.util.List;

/**
 * 有很多时候，处理需要根据事件不同进行不同处理，还需要事件源对象,事件可以抽象成体系.
 */
class Child {
    private boolean cry = false;
    List<Observer> observers = new ArrayList<Observer>();

    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
    }

    public void wakeUp() {
        cry = true;
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).wakeUpAction(event);
        }
    }
}


abstract class Event<T> {
    abstract T getSource();
}

class WakeUpEvent extends Event<Child> {
    long timeStamp;
    String loc;
    Child source;

    public WakeUpEvent(long timeStamp, String loc, Child source) {
        this.timeStamp = timeStamp;
        this.loc = loc;
        this.source = source;
    }

    @Override
    public Child getSource() {
        return source;
    }
}

interface Observer {
    public void wakeUpAction(Event e);
}

class Dad implements Observer {
    public void wakeUpAction(Event e) {
        feed();
    }

    public void feed() {
        System.out.println("Dad feeding ....");
    }
}

class Mom implements Observer {

    public void wakeUpAction(Event e) {
        hug();
    }

    public void hug() {
        System.out.println("Dad huging ....");
    }
}

class Dog implements Observer {

    public void wakeUpAction(Event e) {
        wang();
    }

    public void wang() {
        System.out.println("Dog wanging ....");
    }
}

public class Main8 {
    public static void main(String[] args) {

    }
}
