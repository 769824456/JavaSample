package java基础.注解.annotation;

/**
 * Created by yulongsun on 2016/4/20.
 */

public class Demo {

    @Name(name = "yulongsun")
    @Deprecated
    public String say() {
        return "Hell yulongsun";
    }
}
