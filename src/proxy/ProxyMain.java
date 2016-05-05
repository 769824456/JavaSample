package proxy;

import java.lang.reflect.Proxy;

/**
 * @Project AndroidSample
 * @Packate win.yulongsun.androidsample.proxy
 * @Author yulongsun
 * @Email yulongsun@gmail.com
 * @Date 2016/5/5
 * @Version 1.0.0
 * @Description
 */
public class ProxyMain {


    public static void main(String[] args) {
        TimingInvocationHandler timingInvocationHandler = new TimingInvocationHandler(new OperatorImpl());

        //Proxy.newProxyInstance(…)函数新建了一个代理对象
        //生成动态代理类，运行时才生成，所以称为动态代理
//        loader表示类加载器
//        interfaces表示委托类的接口，生成代理类时需要实现这些接口
//        h是InvocationHandler实现类对象，负责连接代理类和委托类的中间类
        Operator operator = (Operator) Proxy.newProxyInstance(Operator.class.getClassLoader(), new Class[]{Operator.class}, timingInvocationHandler);

        operator.operatorMethod1();
        operator.operatorMethod2();
        operator.operatorMethod3();
    }
}
