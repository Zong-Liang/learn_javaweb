package com.learn_javaweb.schedule.service.impl;

import com.learn_javaweb.schedule.pojo.SysUser;
import com.learn_javaweb.schedule.service.SysUserService;
import com.learn_javaweb.schedule.util.MD5Util;
import com.learn_javaweb.schedule.dao.SysUserDao;
import com.learn_javaweb.schedule.dao.impl.SysUserDaoImpl;

public class SysUserServiceImpl implements SysUserService {
    private SysUserDao userDao = new SysUserDaoImpl();

    @Override
    public int regist(SysUser sysUser) {
        //将用户明文密码转换为密文密码
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        //调用DAO层方法将用户信息保存到数据库
        return userDao.addSysUser(sysUser);
    }

    @Override
    public SysUser findByUsername(String username) {
        SysUser sysUser = userDao.findByUsername(username);
        return null;
    }
}
