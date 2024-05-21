package com.learn_javaweb.schedule.service;

import com.learn_javaweb.schedule.pojo.SysUser;

public interface SysUserService {
    /**
     * 用户注册
     *
     * @param sysUser
     * @return
     */
    int regist(SysUser sysUser);

    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    SysUser findByUsername(String username);
}
