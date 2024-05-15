package com.learn_javaweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/servletLifeCycle", loadOnStartup = 6)
public class ServletLifeCycle extends HttpServlet {
    public ServletLifeCycle() {
        System.out.println("ServletLifeCycle()");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init()");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("service()");
    }

    @Override
    public void destroy() {
        System.out.println("destory()");
    }
}
