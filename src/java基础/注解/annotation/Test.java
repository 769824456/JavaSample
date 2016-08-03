package java基础.注解.annotation;

/**
 * Created by yulongsun on 2016/6/8.
 */
public class Test {
    public static void main(String[] args) {
        int y = 4;
        Test test = new Test();
        test.f(y);
        System.out.println("y:" + y);
    }

    private void f(int x) {
        x++;
        System.out.println(x);
    }
}
