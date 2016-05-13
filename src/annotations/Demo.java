package annotations;

import java.lang.reflect.Method;

/**
 * Created by yulongsun on 2016/5/5.
 */
public class Demo {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("annotations.App");
            for (Method method : cls.getMethods()) {
                MethodInfo methodInfo = method.getAnnotation(
                        MethodInfo.class);
                if (methodInfo != null) {
                    System.out.println("method name:" + method.getName());
                    System.out.println("method author:" + methodInfo.author());
                    System.out.println("method version:" + methodInfo.version());
                    System.out.println("method date:" + methodInfo.date());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
