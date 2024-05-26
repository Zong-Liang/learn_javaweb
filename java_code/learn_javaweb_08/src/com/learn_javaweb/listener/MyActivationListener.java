package com.learn_javaweb.listener;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionActivationListener;
import jakarta.servlet.http.HttpSessionEvent;

//需要在web目录下添加META-INF目录，然后在META-INF目录下添加context.xml文件，内容如下：
//<?xml version="1.0" encoding="UTF-8"?>
//<Context>
//    <Manager className="org.apache.catalina.session.PersistentManager" maxIdleSwap="1">
//        <Store className="org.apache.catalina.session.FileStore" directory="d:\mysession"></Store>
//    </Manager>
//</Context>
//这样就可以将session序列化到d:\mysession目录下了
public class MyActivationListener implements HttpSessionActivationListener {
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("sessionWillPassivate");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("sessionDidActivate");
    }
}
