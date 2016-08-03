package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Project AndroidSample
 * @Packate win.yulongsun.androidsample.proxy
 * @Author yulongsun
 * @Email yulongsun@gmail.com
 * @Date 2016/5/5
 * @Version 1.0.0
 * @Description
 */
public class TimingInvocationHandler implements InvocationHandler {
    private static final String TAG = TimingInvocationHandler.class.getSimpleName();
    private Object target;

    public TimingInvocationHandler() {
    }

    public TimingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long   start = System.currentTimeMillis();
        System.out.println("qian");
        Object obj   = method.invoke(target, args);
        System.out.println("hou");
//        System.out.println("invoke: " + method.getName() + "cost time is :" + (System.currentTimeMillis() - start));
        return obj;
    }
}
