package proxy;


/**
 * @Project AndroidSample
 * @Packate win.yulongsun.androidsample.proxy
 * @Author yulongsun
 * @Email yulongsun@gmail.com
 * @Date 2016/5/5
 * @Version 1.0.0
 * @Description
 */
public class OperatorImpl implements Operator {
    private static final String TAG = OperatorImpl.class.getSimpleName();

    @Override
    public void operatorMethod1() {
        System.out.println("operatorMethod1: ");
    }

    @Override
    public void operatorMethod2() {
        System.out.println("operatorMethod2: ");
    }

    @Override
    public void operatorMethod3() {
        System.out.println("operatorMethod3");
    }
}
