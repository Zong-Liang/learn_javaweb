package com.learn_javaweb;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(urlPatterns = "/servletContextTest")
public class ServletContextTest extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        ServletContext context = getServletConfig().getServletContext();
//        ServletContext context = req.getServletContext();
        ServletContext context = getServletContext();

        Enumeration<String> initParameterNames = context.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String paraNames = initParameterNames.nextElement();
            System.out.println(paraNames + "=" + context.getInitParameter(paraNames));
        }

        String encoding = context.getInitParameter("encoding");
        System.out.println("encoding=" + encoding);

        String path = context.getRealPath("upload");
        System.out.println(path);

        String contextPath = context.getContextPath();
        System.out.println(contextPath);
    }
}
