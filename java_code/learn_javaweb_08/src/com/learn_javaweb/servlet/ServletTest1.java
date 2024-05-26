package com.learn_javaweb.servlet;

import com.learn_javaweb.listener.MyActivationListener;
import com.learn_javaweb.listener.SessionBindingListener;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/servletTest1")
public class ServletTest1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //向应用域中放入数据
        req.getServletContext().setAttribute("data", "hello, servlet");

        HttpSession session = req.getSession();

        SessionBindingListener sbl = new SessionBindingListener();

        //向session中放入数据
        session.setAttribute("sbl", sbl);
        session.removeAttribute("sbl");

        MyActivationListener mal = new MyActivationListener();
        session.setAttribute("mal", mal);

        //手动销毁session
        session.invalidate();
    }
}
