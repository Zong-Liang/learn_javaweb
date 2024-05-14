# 01_servlet简介

静态资源：无需在程序运行时通过代码运行生成的资源，在程序运行之前就写好了。

动态资源：需要在程序运行时通过代码运行生成的资源，在程序运行之前无法确定数据，运行时动态生成。



> servlet (server applet) 是运行在服务端 (Tomcat) 的 Java 小程序，是 sun 公司提供一套定义动态资源规范，代码层面上 servlet 就是一个接口。

servlet 用来接收、处理客户端请求、响应给浏览器的动态资源。在整个 web 应用中，servlet 主要负责接收处理请求、协同调度功能以及响应数据，可以把 servlet 称为 web 应用中的控制器。

不是所有的 Java 类都能用于处理客户端请求，能处理客户端请求并做出响应的一套技术标准就是 servlet。

servlet 是运行在服务端的，所以 servlet 必须在web项目中开发，且在 tomcat 这样的服务容器中运行。



tomcat 接收到请求后，会将请求报文的信息转换成一个 `HttpServletRequest` 对象，该对象中包含了请求我中的所有信息 (请求行 请求头 请求体)。

tomcat 同时创建了一个 `HttpServletResponse` 对象，该对象用于盛装要响应给客户端的信息，后面这个对象会转换成响应的报文 (响应行 响应头 响应体)。

tomcat 根据请求中的资源路径找到对应的 servlet，将 servlet 实例化，调用service 方法，同时将 `HttpServletRequest` 和 `HttpServletResponse` 对象传入。

- 从 request 对象中获取请求的所有信息 (参数)。

- 根据参数生成要响应给客户端的数据。

- 将响应的数据放入 response 对象。