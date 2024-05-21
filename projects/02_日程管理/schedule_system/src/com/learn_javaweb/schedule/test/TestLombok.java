package com.learn_javaweb.schedule.test;

import com.learn_javaweb.schedule.pojo.SysUser;
import org.junit.jupiter.api.Test;

public class TestLombok {
    @Test
    public void testAnnotation() {
        SysUser user1 = new SysUser();
        SysUser user2 = new SysUser(1, "zhangsan", "123456");
        user1.setUid(2);
        user1.setUsername("lisi");
        user1.setUserPwd("654321");
        System.out.println(user1.getUid());
        System.out.println(user1.getUsername());
        System.out.println(user1.getUserPwd());
    }
}
