package annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * Created by yulongsun on 2016/4/20.
 */
//注解方法1
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = METHOD) //能够注解在哪里
public @interface Name {
    String name() default "username";//default默认值
}


//注解方法2
//public interface Name extends Annotation{
//}
