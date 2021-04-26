package com.cry.dp;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.HashMap;

public class Person {
    public static void main(String[] args) {
//        Enhancer enhancer=new Enhancer();
//        enhancer.setSuperclass(Person.class);
//        enhancer.setCallback(new MyMethodInterceptor(new Person()));
//        Person p = (Person) enhancer.create();
//        p.sayHello();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>(12);

        hashMap.put(1, "zhangSan1");
        hashMap.put(2, "zhangSan2");
        hashMap.put(3, "zhangSan3");

    }
    public void sayHello(){
        System.out.println("say hello");
    }
}
class MyMethodInterceptor implements MethodInterceptor{
    Person p;
    public MyMethodInterceptor(Person p){
        this.p=p;
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前");
        method.invoke(p,objects);
        System.out.println("后");
        return null;
    }
}
