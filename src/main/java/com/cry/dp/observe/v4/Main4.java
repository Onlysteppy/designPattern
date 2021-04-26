package com.cry.dp.observe.v4;

/**
 * 加入多个观察者
 */
class Child {
    private boolean cry = false;
    private Dad dad = new Dad();
    private Mom mom = new Mom();
    private Dog dog = new Dog();

    public void wakeUp() {
        cry = true;
        dad.feed();
        mom.hug();
        dog.wang();
    }

}

class Dad {
    public void feed() {
        System.out.println("Dad feeding ....");
    }
}

class Mom {
    public void hug() {
        System.out.println("Mom huging ....");
    }
}

class Dog {
    public void wang() {
        System.out.println("Dog wanging ....");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

