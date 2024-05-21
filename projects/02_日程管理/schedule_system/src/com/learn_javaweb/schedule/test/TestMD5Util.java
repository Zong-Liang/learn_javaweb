package com.learn_javaweb.schedule.test;

import com.learn_javaweb.schedule.util.MD5Util;
import org.junit.jupiter.api.Test;

public class TestMD5Util {
    @Test
    public void testEncrypt() {
        String encrypt = MD5Util.encrypt("123456");
        System.out.println(encrypt);
    }
}
