package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by yulongsun on 2016/4/20.
 */
public class ReflectDemo {

    public static void main(String[] args) {


        try {
            //反射获取Class
            Class<?>     c           = Class.forName("annotation.Demo");
            //获取注解方法
            Method       say         = c.getMethod("say");
            Annotation[] annotations = say.getAnnotations();
//            for (Annotation a : annotations) {
//                System.out.println(a.toString());
//            }
            //输出注解内容
            Name name = say.getAnnotation(Name.class);
            System.out.printf(name.name());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
