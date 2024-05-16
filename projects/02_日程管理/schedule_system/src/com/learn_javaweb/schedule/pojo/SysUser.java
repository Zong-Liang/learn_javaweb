package com.learn_javaweb.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/*
    数据库实体类
    实体类的名称和表格名称应该对应(对应不是完全一样)
    实体类的属性名和表格的列名应该对应
    每个属性都必须是私有的
    每个属性应该具备 getter setter 方法
    必须配备无参构造器
    应该实现序列化接口(缓存 分布式项目数据传递 可能会将对象序列化)
    应该重写类的 hashCode 和 equals 方法
    toString 方法是否重写都可以

    使用lombok生成getter setter方法 无参构造器 全参构造器 重写hashCode和equals方法 实现序列化接口
    lombok插件安装: File -> Settings -> Plugins -> 搜索lombok -> 安装 -> 重启idea
    lombok插件使用步骤：
        检查是否安装成功
        检查是否勾选Enable annotation processing
        导入lombok依赖
        使用注解
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;

//    public SysUser() {
//    }
//
//    public SysUser(Integer uid, String username, String userPwd) {
//        this.uid = uid;
//        this.username = username;
//        this.userPwd = userPwd;
//    }
//
//    public Integer getUid() {
//        return uid;
//    }
//
//    public void setUid(Integer uid) {
//        this.uid = uid;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getUserPwd() {
//        return userPwd;
//    }
//
//    public void setUserPwd(String userPwd) {
//        this.userPwd = userPwd;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof SysUser sysUser)) return false;
//        return Objects.equals(uid, sysUser.uid) && Objects.equals(username, sysUser.username) && Objects.equals(userPwd, sysUser.userPwd);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(uid, username, userPwd);
//    }
}
