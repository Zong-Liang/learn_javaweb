package com.learn_javaweb;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/httpServletRequestAPITest")
public class HttpServletRequestAPITest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //行相关 GET/POST uri http/1.1
        System.out.println(req.getMethod()); //获取求方式
        System.out.println(req.getScheme()); //获取请求协议
        System.out.println(req.getProtocol()); //获取请求协议及版本
        System.out.println(req.getRequestURI()); //获取请求的URI
        System.out.println(req.getRequestURL()); //获取请求的URL
        System.out.println(req.getLocalPort()); //本应用容器的端口号
        System.out.println(req.getRemotePort()); //客户端软件端口号
        System.out.println(req.getServerPort()); //客户端发请求时使用的端口号
        System.out.println(req.getServletPath());

        //头相关 key:value ...
        //单独获取某个请求头
        String accept = req.getHeader("Accept");
        System.out.println("accept:" + accept);

        //获取所有请求头的名字
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            System.out.println("headerName:" + headerName);
        }

        //获取键值对形式的参数
        String username = req.getParameter("username");
        System.out.println("username:" + username);
        String password = req.getParameter("uesrpwd");
        System.out.println("uesrpwd:" + password);

        //根据参数名获取多个参数值
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println("hobby:" + Arrays.toString(hobbies));

        //获取所有参数名
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            String[] parameterValues = req.getParameterValues(parameterName);
            if (parameterValues.length > 1) {
                System.out.println("parameterName:" + Arrays.toString(parameterValues));
            } else {
                System.out.println("parameterName:" + parameterValues[0]);
            }
        }

        //返回所有参数的map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<Map.Entry<String, String[]>> entrySet = parameterMap.entrySet();
        for (Map.Entry<String, String[]> stringEntry : entrySet) {
            String paraName = stringEntry.getKey();
            String[] value = stringEntry.getValue();
            if (value.length > 1) {
                System.out.println(paraName + ":" + Arrays.toString(value));
            } else {
                System.out.println(paraName + ":" + value[0]);
            }
        }

        //获取非键值对数据
        //获取一个从请求体中读取的字符输入流
        //BufferedReader reader = req.getReader(); //JSON串
        //获取一个从请求体中读取二进制数据字节的输入流
        //ServletInputStream inputStream = req.getInputStream(); //文件
    }
}
