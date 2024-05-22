package com.learn_javaweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cookieTest1")
public class CookieTest1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建Cookie
        Cookie cookie1 = new Cookie("key_1", "value_1");
        cookie1.setMaxAge(60); //设置Cookie的有效期为60秒
        cookie1.setPath("/learn_javaweb_05_war_exploded/cookieTest1"); //设置Cookie的有效路径为/learn_javaweb_05_war_exploded/cookieTest1
        Cookie cookie2 = new Cookie("key_2", "value_2");

        //将Cookie放入resp对象中
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}
