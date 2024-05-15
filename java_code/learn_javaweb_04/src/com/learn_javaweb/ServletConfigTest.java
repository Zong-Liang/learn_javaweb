package com.learn_javaweb;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(
        urlPatterns = "/servletConfigTest",
        initParams = {@WebInitParam(name = "key_a", value = "value_a"), @WebInitParam(name = "key_b", value = "value_b")}
)
public class ServletConfigTest extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ServletConfig config = getServletConfig();

        Enumeration<String> initParameterNames = config.getInitParameterNames();
        if (initParameterNames.hasMoreElements()) {
            String paraNames = initParameterNames.nextElement();
            System.out.println(paraNames + "=" + config.getInitParameter(paraNames));
        }

        String key_a = config.getInitParameter("key_a");
        System.out.println("key_a=" + key_a);
    }
}
