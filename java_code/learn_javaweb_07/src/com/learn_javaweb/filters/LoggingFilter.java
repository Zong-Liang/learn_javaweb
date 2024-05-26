package com.learn_javaweb.filters;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志过滤器
 * 1. 实现 Filter 接口
 * 2. 重写 doFilter 方法
 * 3. 在 web.xml 中配置过滤器
 */
public class LoggingFilter implements Filter {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 过滤请求和响应的方法
     * 请求到达目标资源之前先经过该方法
     * 该方法有能力控制请求是否继续向后到达目标资源，可以在该方法内直接向客户端做响应处理
     * 请求到达目标资源之后，响应之前再次经过该方法
     *
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        String requestURI = req.getRequestURI();
        String dataTime = sdf.format(new Date());
        System.out.println(dataTime + " " + requestURI + " 资源被访问了！");

        long start = System.currentTimeMillis();

        //请求到达目标资源之前的代码
        System.out.println("LoggingFilter before filterChain.doFilter invoked!");

        //放行
        filterChain.doFilter(servletRequest, servletResponse);

        long end = System.currentTimeMillis();
        System.out.println("请求耗时：" + (end - start) + "ms");

        //响应之前的代码
        System.out.println("LoggingFilter after filterChain.doFilter invoked!");
    }
}
