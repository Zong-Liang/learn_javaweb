package com.learn_javaweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/sessionTest1")
public class SessionTest1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收请求参数
        String username = req.getParameter("username");

        //获取Session对象
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(120); //设置Session对象的超时时间为120秒，不常用

        //判断请求中是否有一个特殊的Cookie JSESSIONID
        //如果没有，创建一个新的Session对象
        //如果有，获取到对应的Session对象
        System.out.println(session.getId());
        System.out.println(session.isNew());

        //将数据存入Session对象
        session.setAttribute("username", username);

        //客户端响应信息
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().write("SessionTest1");
    }
}
