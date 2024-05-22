package com.learn_javaweb.filters;


import jakarta.servlet.*;

import java.io.IOException;

/**
 * 日志过滤器
 * 1. 实现 Filter 接口
 * 2. 重写 doFilter 方法
 * 3. 在 web.xml 中配置过滤器
 */
public class LoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //请求到达目标资源之前的代码
        System.out.println("LoggingFilter before doFilter invoked!");

        //放行
        filterChain.doFilter(servletRequest, servletResponse);

        //响应之前的代码
        System.out.println("LoggingFilter after filterChain.doFilter invoked!");
    }
}
