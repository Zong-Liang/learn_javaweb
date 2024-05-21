package com.learn_javaweb.schedule.test;

import com.learn_javaweb.schedule.dao.BaseDao;
import com.learn_javaweb.schedule.pojo.SysUser;
import org.junit.jupiter.api.Test;

import java.util.List;


public class TestBaseDao {
    private final BaseDao baseDao = new BaseDao();

    @Test
    public void testBaseQueryObject() {
        String sql = "select count(1) from sys_user";
        Long count = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(count);
    }

    @Test
    public void testBaseQuery() {
        String sql = "select uid,username,user_pwd userPwd from sys_user";
        List<SysUser> sysUserList = baseDao.baseQuery(SysUser.class, sql);
        sysUserList.forEach(System.out::println);
    }

    @Test
    public void testBaseUpdate() {
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseDao.baseUpdate(sql, "1", "学习Java", 0);
        System.out.println(rows);
    }
}
