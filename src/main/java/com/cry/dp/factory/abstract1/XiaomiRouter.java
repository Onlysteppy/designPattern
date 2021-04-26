package com.cry.dp.factory.abstract1;

public class XiaomiRouter implements RouterProduct {
    public void start() {
        System.out.println("启动小米路由器");
    }

    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    public void openWifi() {
        System.out.println("开启小米Wifi");
    }

    public void setting() {
        System.out.println("设置小米");
    }
}
