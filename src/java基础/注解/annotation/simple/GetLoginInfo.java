package java基础.注解.annotation.simple;

import java.lang.reflect.Method;

/**
 * Created by yulongsun on 2016/4/20.
 */
public class GetLoginInfo {

    public static void main(String[] args) {
        try {
            Class<?>  clazz     = Class.forName("java基础.注解.annotation.simple.LoginSimple");
            Method    login     = clazz.getMethod("login");
            LoginInfo loginInfo = login.getAnnotation(LoginInfo.class);
            System.out.println("loginfo=" + loginInfo.name() + "," + loginInfo.password());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
