# 01_http简介

http 1.1：

- http的第一个标准化版本，于1997年初发布，支持7种请求方法：`OPTIONS`、`GET`、`HEAD`、`POST`、`PUT`、`DELETE`、`TRACE`。
- http 1.1是http 1.0 的增强：
  - 虚拟主机允许从单个IP地址提供多个域。
  - 持久连接和流水线连接允许Web浏览器通过单个持久连接发送多个请求。
  - 缓存支持节省了带宽并使响应速度更快。
- http 1.1在接下来的15年左右将非常稳定。
- 在此期间，出现了https (安全超文本传输协议)，它是使用SSL/TLS进行安全加密通信的http的安全版本。

交互的方式：

- 请求：永远都是客户端向服务端发送。
- 响应：永远都是服务端向客户端返回。

数据格式：

- 请求时发送的数据称为请求报文。
- 响应时返回的数据称为响应报文。

> 报文是有规定的格式的。