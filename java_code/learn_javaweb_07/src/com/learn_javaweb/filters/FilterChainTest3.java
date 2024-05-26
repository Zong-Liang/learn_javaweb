package com.learn_javaweb.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/*")
public class FilterChainTest3 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterChainTest3 before filterChain.doFilter invoked!");

        //放行
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("FilterChainTest3 doFilter after filterChain.doFilter invoked!");
    }
}
