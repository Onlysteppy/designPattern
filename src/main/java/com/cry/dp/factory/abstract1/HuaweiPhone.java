package com.cry.dp.factory.abstract1;

public class HuaweiPhone implements PhoneProduct {
    public void start() {
        System.out.println("开启华为手机");
    }

    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    public void callup() {
        System.out.println("华为打电话");
    }

    public void sendSMS() {
        System.out.println("华为发送消息");
    }
}
