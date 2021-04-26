package com.cry.dp.factory.abstract1;

public class HuaweiRouter implements RouterProduct {
    public void start() {
        System.out.println("启动华为路由器");
    }

    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    public void openWifi() {
        System.out.println("开启华为Wifi");
    }

    public void setting() {
        System.out.println("设置华为");
    }
}
