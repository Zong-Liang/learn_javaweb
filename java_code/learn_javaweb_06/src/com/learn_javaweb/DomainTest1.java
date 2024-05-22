package com.learn_javaweb;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/domainTest1")
public class DomainTest1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //向请求域存放数据
        req.setAttribute("req", "reqValue");

        //向会话域请求数据
        HttpSession session = req.getSession();
        session.setAttribute("session", "sessionValue");

        //向应用域请求数据
        ServletContext app = req.getServletContext();
        app.setAttribute("app", "appValue");
    }
}
