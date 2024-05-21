package com.learn_javaweb.schedule.dao;

import com.learn_javaweb.schedule.pojo.SysUser;

/**
 * data access object 数据访问对象 用于封装对数据库的访问操作
 * 这里的SysUserDao用于封装对sys_user表的访问操作
 */
public interface SysUserDao {
    /**
     * 向sys_user表中添加一条用户记录
     *
     * @param sysUser
     * @return
     */
    int addSysUser(SysUser sysUser);

    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    SysUser findByUsername(String username);
}
