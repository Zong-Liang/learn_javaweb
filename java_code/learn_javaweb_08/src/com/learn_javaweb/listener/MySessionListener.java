package com.learn_javaweb.listener;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        //任何一个session对象创建都会触发这个方法
        System.out.println("sessionCreated");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        //任何一个session对象销毁都会触发这个方法
        System.out.println("sessionDestroyed");
    }
}
