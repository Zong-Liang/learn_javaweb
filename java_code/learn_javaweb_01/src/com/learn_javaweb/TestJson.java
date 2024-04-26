package com.learn_javaweb;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class TestJson {
    @Test
    public void test1() {
        Person person = new Person("张三", 23, new Dog("旺财"));
        // 使用Jackson将对象转换为json字符串
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(person);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        String json = "{\"name\":\"张三\",\"age\":23,\"dog\":{\"name\":\"旺财\"}}";
        // 使用Jackson将json字符串转换为对象
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Person person = objectMapper.readValue(json, Person.class);
            System.out.println(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        Map map = new HashMap();
        map.put("name", "张三");
        map.put("age", 23);
        map.put("dog", new Dog("旺财"));
        // 使用Jackson将Map转换为json字符串
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(map);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4() {
        List list = new ArrayList();
        list.add(new Person("张三", 23, new Dog("旺财")));
        list.add(new Person("李四", 24, new Dog("小白")));
        // 使用Jackson将List转换为json字符串
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(list);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test5() {
        String json = "[{\"name\":\"张三\",\"age\":23,\"dog\":{\"name\":\"旺财\"}},{\"name\":\"李四\",\"age\":24,\"dog\":{\"name\":\"小白\"}}]";
        // 使用Jackson将json字符串转换为List
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List list = objectMapper.readValue(json, List.class);
            System.out.println(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
