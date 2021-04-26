package com.cry.dp.factory.abstract1;

public class XiaomiPhone implements PhoneProduct {
    public void start() {
        System.out.println("开启小米手机");
    }

    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    public void callup() {
        System.out.println("小米打电话");
    }

    public void sendSMS() {
        System.out.println("小米发送消息");
    }
}
