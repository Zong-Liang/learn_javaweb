package com.learn_javaweb;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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

        //获得一个指向项目部署位置下的某个文件/目录的磁盘真实路径的API
        String path = context.getRealPath("upload");
        System.out.println(path);

        //获得项目部署上下文路径，项目的访问路径
        String contextPath = context.getContextPath();
        System.out.println(contextPath);

        //作为域对象一定有的API
        //setAttribute()向域中存储/修改数据
        context.setAttribute("key_c", "value_c");
        context.setAttribute("key_c", "value_cc");

        //getAttribute()获取域中的数据
        String key_c = (String) context.getAttribute("key_c");
        System.out.println(key_c);

        //移除域中的数据
        context.removeAttribute("key_c");
    }
}
