package com.learn_javaweb;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/httpServletResponseAPITest")
public class HttpServletResponseAPITest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应行相关的API HTTP/1.1 200/404/405/500...
        resp.setStatus(2000);
//        resp.setHeader("Content-Type", "text/html");
//        resp.setHeader("Content-Length", "1234");
        resp.setContentType("text/html");
//        resp.setContentLength(1234);
        String info = "<h1>Hello</h1>";
        resp.setContentLength(info.getBytes().length);

        //设置响应体内容API
        PrintWriter writer = resp.getWriter();
        writer.write(info);

//        ServletOutputStream outputStream = resp.getOutputStream();
    }
}
