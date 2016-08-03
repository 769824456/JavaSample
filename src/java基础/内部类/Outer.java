package java基础.内部类;

/**
 * CREATE ：yulongsun
 * DATE ：2016/7/8
 * DESC:
 * 内部类的访问规则：
 * 1.内部类可以直接访问外部类的成员。包括私有。
 * 之所以能直接访问外部类的成员是因为：内部类持有一个外部类的引用，格式：外部类.this
 * 2.外部类要访问内部类，必须建立内部类的对象
 */
public class Outer {
    private int a = 3;

    class Innner {
//        int a = 4;

        void fun() {
//            int a = 5;
            System.out.println(a);
        }
    }

    void method() {
        Innner innner = new Innner();
        innner.fun();
    }


    void print() {
        String name = super.getClass().getSimpleName();
        System.out.println("name=" + name);
    }
}

class InnerClassDemo {
    public static void main(String[] agrs) {
        Outer outer = new Outer();
//        Outer.Innner innner = outer.new Innner();
//        innner.fun();
//        outer.method();
        outer.print();
    }
}
