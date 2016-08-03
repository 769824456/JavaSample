package java基础.注解.annotation.simple;

import java.lang.annotation.*;

/**
 * Created by yulongsun on 2016/4/20.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LoginInfo {
    String name();
    String password();
}
