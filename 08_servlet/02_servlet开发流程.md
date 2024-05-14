# 02_servlet开发流程

- 创建JavaWeb项目，同时将tomcat添加为当前项目依赖。

- 重写service方法 `service(HttpServletRequest req, HttpServletResponse resp)`。

- 在service方法中定义业务处理代码。

  - 从 request 对象中获取请求的所有信息 (参数)。

  - 根据参数生成要响应给客户端的数据。

  - 将响应的数据放入 response 对象。

- 在 web.xml 中配置 servlet 对应的请求映射路径。

servlet-api.jar 导入问题：servlet-api 编码的时候需要，运行的时候在服务器环境中由服务软件 tomcat 提供，所以在 javaweb 项目中在打包/构建的过程中是无需携带 servlet-api.jar的。

Content-Type 响应头问题：MIME 类型响应头 媒体类型、文件类型、响应的数据类型，MIME 类型用于告诉客户端响应的数据是什么类型的数据，客户端以此决定用什么方式解析响应体。(conf/web.xml 里记录了所有MIME 类型)