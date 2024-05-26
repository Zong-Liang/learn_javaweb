package com.learn_javaweb.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/*")
public class FilterChainTest1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterChainTest1 before filterChain.doFilter invoked!");

        //放行
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("FilterChainTest1 doFilter after filterChain.doFilter invoked!");
    }
}
