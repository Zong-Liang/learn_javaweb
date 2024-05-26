package com.learn_javaweb.listener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyAppListener implements ServletContextListener, ServletContextAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        System.out.println(servletContext.hashCode() + " web app is initialized!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        System.out.println(servletContext.hashCode() + " web app is destroyed!");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("attributeAdded: " + scae.getName() + " = " + scae.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("attributeRemoved: " + scae.getName() + " = " + scae.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("attributeReplaced: " + scae.getName() + " = " + scae.getValue());
    }
}
