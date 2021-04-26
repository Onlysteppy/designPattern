package com.cry.dp.observe.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * 很多时候观察者需要根据事件的具体情况来进行处理
 */
public class Main6 {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

class Child {
    private boolean cry = false;
    List<Observe> list = new ArrayList<Observe>();

    {
        list.add(new Dad());
        list.add(new Mom());
        list.add(new Dog());
    }

    public void wakeUp() {
        cry = true;
        for (Observe l : list) {
            l.actionOnWakeUp(new WakeUpEvent(System.currentTimeMillis(), "床上"));
        }
    }
}

class WakeUpEvent {
    long timeStamp;
    String loc;

    public WakeUpEvent(long timeStamp, String loc) {
        this.timeStamp = timeStamp;
        this.loc = loc;
    }
}

interface Observe {
    public void actionOnWakeUp(WakeUpEvent event);
}

class Dad implements Observe {

    public void actionOnWakeUp(WakeUpEvent event) {
        feed();
    }

    public void feed() {
        System.out.println("Dad feeding ....");
    }
}

class Mom implements Observe {

    public void hug() {
        System.out.println("Mom Huging ....");
    }

    public void actionOnWakeUp(WakeUpEvent event) {
        hug();
    }
}

class Dog implements Observe {
    public void wang() {
        System.out.println("Dog wanging ....");
    }

    public void actionOnWakeUp(WakeUpEvent event) {
        wang();
    }
}