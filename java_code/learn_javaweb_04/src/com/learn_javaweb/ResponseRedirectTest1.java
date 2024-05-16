package com.learn_javaweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/responseRedirectTest1")
public class ResponseRedirectTest1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ResponseRedirectTest1 执行了");

        //响应重定向 设置响应状态码为302，同时设置location响应头
        resp.sendRedirect("ResponseRedirectTest2");
    }
}
