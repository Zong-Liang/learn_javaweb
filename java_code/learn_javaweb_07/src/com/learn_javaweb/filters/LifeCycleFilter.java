package com.learn_javaweb.filters;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet(value = "/lifeCycleFilter")
public class LifeCycleFilter implements Filter {
    /**
     * 过滤器生命周期
     * 1. 实例化 构造器
     * 2. 初始化 init
     * 3. 过滤请求和响应 doFilter
     * 4. 销毁 destroy
     */

    public LifeCycleFilter() {
        System.out.println("LifeCycleFilter constructor used!");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LifeCycleFilter init used!");
        System.out.println(filterConfig.getInitParameter("dataTimePattern"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("LifeCycleFilter doFilter used!");

        //放行
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("LifeCycleFilter destroy used!");
    }
}
