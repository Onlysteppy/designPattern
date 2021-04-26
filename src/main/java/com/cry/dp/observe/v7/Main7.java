package com.cry.dp.observe.v7;


import java.util.ArrayList;
import java.util.List;

/**
 * 有很多时候，处理需要根据事件不同进行不同处理，还需要事件源对象.
 */
class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<Observer>();

    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
    }

    public void wakeUp() {
        cry = true;
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "房间", this);
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).wakeUpAction(event);
        }
    }
}

class WakeUpEvent {
    long timeStamp;
    String loc;
    Child source;

    public WakeUpEvent(long timeStamp, String loc, Child source) {
        this.timeStamp = timeStamp;
        this.loc = loc;
        this.source = source;
    }

    public void setSorce(Child sorce) {
        this.source = sorce;
    }
}

interface Observer {
    public void wakeUpAction(WakeUpEvent wakeUpEvent);
}

class Dad implements Observer {

    public void feed() {
        System.out.println("Dad feeding ....");
    }

    public void wakeUpAction(WakeUpEvent wakeUpEvent) {
        feed();
    }
}

class Mom implements Observer {

    public void hug() {
        System.out.println("Mom Huging ....");
    }

    public void wakeUpAction(WakeUpEvent wakeUpEvent) {
        hug();

    }
}

class Dog implements Observer {
    public void wang() {
        System.out.println("Dog wanging ....");
    }

    public void wakeUpAction(WakeUpEvent wakeUpEvent) {
        wang();
    }
}


public class Main7 {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
