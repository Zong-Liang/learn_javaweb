package com.learn_javaweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/domainTest2")
public class DomainTest2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求域数据
        Object reqValue = req.getAttribute("req");
        System.out.println("req: " + reqValue);

        //获取会话域数据
        Object sessionValue = req.getSession().getAttribute("session");
        System.out.println("session: " + sessionValue);

        //获取应用域数据
        Object appValue = req.getServletContext().getAttribute("app");
        System.out.println("app: " + appValue);
    }
}
