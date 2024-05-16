# 06_ServletConfig和ServletContext

`ServletConfig`：

- `getServletConfig()`
- `getInitParameterNames()`

```java
@WebServlet(
        urlPatterns = "/servletConfigTest",
        initParams = {@WebInitParam(name = "key_a", value = "value_a"), @WebInitParam(name = "key_b", value = "value_b")}
)
public class ServletConfigTest extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ServletConfig config = getServletConfig();

        Enumeration<String> initParameterNames = config.getInitParameterNames();
        if (initParameterNames.hasMoreElements()) {
            String paraNames = initParameterNames.nextElement();
            System.out.println(paraNames + "=" + config.getInitParameter(paraNames));
        }

        String key_a = config.getInitParameter("key_a");
        System.out.println("key_a=" + key_a);
    }
}
```

`ServletContext`：

- `getServletContext()`
- `getInitParameterNames()`

- `getRealPath()`
- `getContextPath()`

域对象：一些用于存储数据和传递数据的对象，不同的域对象传递的数据的范围也不同。

```java
@WebServlet(urlPatterns = "/servletContextTest")
public class ServletContextTest extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        ServletContext context = getServletConfig().getServletContext();
//        ServletContext context = req.getServletContext();
        ServletContext context = getServletContext();

        Enumeration<String> initParameterNames = context.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String paraNames = initParameterNames.nextElement();
            System.out.println(paraNames + "=" + context.getInitParameter(paraNames));
        }

        String encoding = context.getInitParameter("encoding");
        System.out.println("encoding=" + encoding);

        //获得一个指向项目部署位置下的某个文件/目录的磁盘真实路径的API
        String path = context.getRealPath("upload");
        System.out.println(path);

        //获得项目部署上下文路径，项目的访问路径
        String contextPath = context.getContextPath();
        System.out.println(contextPath);

        //作为域对象一定有的API
        //setAttribute()向域中存储/修改数据
        context.setAttribute("key_c", "value_c");
        context.setAttribute("key_c", "value_cc");

        //getAttribute()获取域中的数据
        String key_c = (String) context.getAttribute("key_c");
        System.out.println(key_c);

        //移除域中的数据
        context.removeAttribute("key_c");
    }
}
```

