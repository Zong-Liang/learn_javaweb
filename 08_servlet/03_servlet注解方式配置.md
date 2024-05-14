# 03_servlet注解方式配置

```java
@WebServlet("/userServlet")
```

```xml
<!--
    配置servlet类并起一个别名
-->
<servlet>
    <servlet-name>userServlet</servlet-name>
    <servlet-class>com.learn_javaweb.Main</servlet-class>
</servlet>

<servlet-mapping>
    <servlet-name>userServlet</servlet-name>
    <url-pattern>/userServlet</url-pattern>
</servlet-mapping>
```

```java
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WebServlet {
    String name() default "";

    String[] value() default {};

    String[] urlPatterns() default {};

    int loadOnStartup() default -1;

    WebInitParam[] initParams() default {};

    boolean asyncSupported() default false;

    String smallIcon() default "";

    String largeIcon() default "";

    String description() default "";

    String displayName() default "";
}
```

