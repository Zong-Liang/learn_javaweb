package com.learn_javaweb;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/requestForwardTest1")
public class RequestForwardTest1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("RequestForwardTest1 执行了");

        //请求转发给RequestForwardTest2
        //获取请求转发器
        RequestDispatcher rd = req.getRequestDispatcher("RequestForwardTest2");
        //进行请求转发操作
        rd.forward(req, resp);

    }
}
