package com.cry.dp.observe.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * 分离观察者与被观察者
 */
public class Main5 {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

class Child {
    private boolean cry = false;
    private List<Observe> observes = new ArrayList<Observe>();

    {
        observes.add(new Dad());
        observes.add(new Mom());
        observes.add(new Dog());
    }

    public void wakeUp() {
        cry = true;
        for (Observe o :
                observes) {
            o.actionOnWakeUp();
        }
    }
}

interface Observe {
    void actionOnWakeUp();
}

class Dad implements Observe {
    public void actionOnWakeUp() {
        feed();
    }

    public void feed() {
        System.out.println("Dad feeding ....");

    }
}

class Mom implements Observe {
    public void actionOnWakeUp() {
        hug();
    }

    public void hug() {
        System.out.println("Mom Huging ....");
    }
}

class Dog implements Observe {
    public void actionOnWakeUp() {
        wang();
    }

    public void wang() {
        System.out.println("Mom Huging ....");
    }
}