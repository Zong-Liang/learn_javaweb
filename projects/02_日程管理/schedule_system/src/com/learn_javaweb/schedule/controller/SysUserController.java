package com.learn_javaweb.schedule.controller;

import com.learn_javaweb.schedule.pojo.SysUser;
import com.learn_javaweb.schedule.service.SysUserService;
import com.learn_javaweb.schedule.service.impl.SysUserServiceImpl;
import com.learn_javaweb.schedule.util.MD5Util;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/user/*")
public class SysUserController extends BaseController {
    private final SysUserService userService = new SysUserServiceImpl();

    /**
     * 接收用户登录请求的业务处理接口
     *
     * @param req
     * @param resp
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 接收请求参数
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");

        // 2. 调用服务层方法完成登录功能
        SysUser loginUser = userService.findByUsername(username);
        if (null == loginUser) {
            resp.sendRedirect("/loginUsernameError.html");
        } else if (!MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())) {
            resp.sendRedirect("/loginPwdError.html");
        } else {
            resp.sendRedirect("/showSchedule.html");
        }

        // 3. 根据处理结果，选择合适的视图进行响应
    }

    /**
     * 接收用户注册请求的业务处理接口(与Java中的接口不是一个概念)
     *
     * @param req
     * @param resp
     */
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 接收请求参数
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");

        // 2. 调用服务层方法完成注册功能
        SysUser sysUser = new SysUser(null, username, userPwd);
        int rows = userService.regist(sysUser);

        // 3. 根据处理结果，选择合适的视图进行响应
        if (rows > 0) {
            resp.sendRedirect("/registSuccess.html");
        } else {
            resp.sendRedirect("/registFail.html");
        }
    }
}
