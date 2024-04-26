# 01_tomcat

一个标准的可以用于发布的web项目标准目录结构：

- D:\apache-tomcat-10.1.23\webapps
  - index.html
  - static
    - img
    - js
    - css
  - WEB-INF (受保护的资源目录，不能通过浏览器直接访问)
    - classes
    - lib
    - web.xml

web项目部署方式：

- 直接将编译好的项目放在webapps目录下。
- 将编译好的项目打包为war文件放在webapps目录下，tomcat启动后会自动解压war包。
- 将项目放在非webapps的其他目录下，在tomcat中通过配置文件指向app的实际磁盘路径。
  - 在磁盘上自定义一个目录存放项目app
  - 在tomcat的conf下创建Catalina/localhost目录，并在该目录下准备一个app.xml文件

```xml
<!--
	path：项目访问路径
	doBase：项目在磁盘中的实际路径
-->
<Context path="/app" docBase="D:\mywebapps\app">
```

IDEA中开发并部署运行web项目：

- 建立tomcat和idea的关联：File | Settings | Build, Execution, Deployment | Application Servers
- 使用idea创建一个javaweb工程，在web工程中开发
- 使用idea将工程构建成一个可以发布的app
- 使用idea将构建好的app部署到tomcat中，启动运行