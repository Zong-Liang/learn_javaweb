# 02_http请求和响应的报文格式

请求报文：

- 请求首行(请求行)：GET/POST 资源路径?参数 HTTP/1.1 (请求方式 资源路径 协议及版本)
- 请求头信息(请求头)
- 空行
- 请求体

```http
GET /learn_javaweb_03_war_exploded/register.html HTTP/1.1
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
Accept-Encoding: gzip, deflate, br, zstd
Accept-Language: en-US,en-GB;q=0.9,en;q=0.8
Connection: keep-alive
Cookie: JSESSIONID=B7E34C67078A744EBB26DAEDF006FA7D
Host: localhost:8080
Referer: http://localhost:8080/learn_javaweb_03_war_exploded/login.html
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: same-origin
Sec-Fetch-User: ?1
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36 Edg/124.0.0.0
sec-ch-ua: "Chromium";v="124", "Microsoft Edge";v="124", "Not-A.Brand";v="99"
sec-ch-ua-mobile: ?0
sec-ch-ua-platform: "Windows"
```

![image-20240513172101306](https://cdn.jsdelivr.net/gh/Zong-Liang/ImageBed@main//202405131721597.png)

```http
POST /user/register HTTP/1.1
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
Accept-Encoding: gzip, deflate, br, zstd
Accept-Language: en-US,en-GB;q=0.9,en;q=0.8
Cache-Control: max-age=0
Connection: keep-alive
Content-Length: 32
Content-Type: application/x-www-form-urlencoded
Host: localhost:8080
Origin: http://localhost:8080
Referer: http://localhost:8080/learn_javaweb_03_war_exploded/register.html
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: same-origin
Sec-Fetch-User: ?1
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36 Edg/124.0.0.0
sec-ch-ua: "Chromium";v="124", "Microsoft Edge";v="124", "Not-A.Brand";v="99"
sec-ch-ua-mobile: ?0
sec-ch-ua-platform: "Windows"
```

![image-20240513173010392](https://cdn.jsdelivr.net/gh/Zong-Liang/ImageBed@main//202405131730488.png)

![image-20240513173117503](https://cdn.jsdelivr.net/gh/Zong-Liang/ImageBed@main//202405131731590.png)

响应报文：

- 响应首行(响应行)：协议/版本 状态码 状态码描述
- 响应头信息(响应头)
- 空行
- 响应体

![image-20240513173623094](https://cdn.jsdelivr.net/gh/Zong-Liang/ImageBed@main//202405131736184.png)

```http
HTTP/1.1 304
ETag: W/"4353-1715587836946"
Date: Mon, 13 May 2024 09:34:03 GMT
Keep-Alive: timeout=20
Connection: keep-alive
```

