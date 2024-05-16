# 01_web乱码问题

乱码问题产生的根本原因：数据编码和解码使用的字符集不是同一个，或者使用了不支持某个语言文字的字符集。

web乱码问题：

- HTML乱码

- Tomcat控制台乱码

- `sout` 乱码：`VM-options：-Dfile.encoding=UTF_8`
- 请求乱码：
  - get 方式请求乱码 (server.xml 中设置 connector 的 `URIEncoding="UTF-8"`)
  - post 方式请求乱码 (设置 `req.setCharacterEncoding("UTF-8");`)

- 响应乱码 (`resp.setCharacterEncoding("UTF-8");`、`resp.setContentType("text/html",charset="UTF-8";)`)

  