package arithmetic.猴子吃桃;

import org.junit.Test;

/**
 * Created by yulongsun on 2016/6/30.
 * 猴子吃桃
 */
public class MonkeyEatFruit {

    /**
     * 空间复杂度：
     * Heap+Stack的最大深度
     */

    /**
     * 题目描述：
     * 一个猴子摘了一堆桃子，第一天吃了桃子的一半后又吃了一个，
     * 第二天也吃了剩下的桃子的一半后又吃了一个，以此吃下去，
     * 到了第十天还剩下一个桃子，问当初猴子总摘了多少个桃子？
     */

    /**
     * 思路：
     * 假设10个桃子
     * 1. 10=（5+1）+4
     * 2. 4 = （2+1）+1
     * 递推：
     * a(n-1)=a(n-1)/2  +1 +a(n)
     */

    /*递推方式*/
    public int eat01(int n) {
        int a = 1;
        for (int i = 2; i <= n; i++) {
            a = 2 * a + 2;
        }
        return a;
    }

    /*递归方式
    * 递归方程：
    * n=1, a(n)=1
    * n>1, a(n)=2a(n-1)+2
    *
    * */
    public int eat02(int n) {
        System.out.println("f(" + n + ")压栈");
        if (n == 1) {
            System.out.println("此时函数栈达到最大深度");
            System.out.println("f(" + n + ")弹栈");
            return 1;
        } else {
            int a = 2 * eat02(n - 1) + 2;
            System.out.println("f(" + n + ")弹栈");
            return a;
        }
    }

    public int eat03(int n) {
        return n == 1 ? 1 : 2 * eat03(n - 1) + 2;
    }

    @Test
    public void test01() {
        int result = eat01(10);
        System.out.println(result);
    }

    @Test
    public void test02() {
        int result = eat02(10);
        System.out.println(result);
    }

    @Test
    public void test03() {
        int result = eat03(10);
        System.out.println(result);
    }
}
