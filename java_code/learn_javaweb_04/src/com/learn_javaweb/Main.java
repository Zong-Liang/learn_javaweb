package com.learn_javaweb;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/userServlet")
public class Main extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");

        String info = "<h1>Yes</h1>";

        if ("atguigu".equals(username)) {
            info = "<h1>No</h1>";
        }

        resp.setHeader("Content-Type", "text/html");

        resp.getWriter().println(info);
    }
}
