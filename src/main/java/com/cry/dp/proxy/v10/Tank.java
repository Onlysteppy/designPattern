package com.cry.dp.proxy.v10;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.omg.PortableInterceptor.Interceptor;

import java.lang.reflect.Method;
import java.util.Random;

public class Tank {
    public void move(){
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(Tank.class);
//        enhancer.setCallback(new MyMethodInterceptor());
//        Tank tank = (Tank)enhancer.create();
//        tank.move();
        try{
            System.out.println("1");
        }catch (Exception e){
            System.out.println("2");
        }finally {
            System.out.println("3");
        }
        System.out.println("4");
    }
}
class MyMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object sub, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("======插入前置通知======");
        Object object = methodProxy.invokeSuper(sub, objects);
        System.out.println("======插入后者通知======");
        return object;
    }
}
