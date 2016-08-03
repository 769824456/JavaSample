package java基础.进制;

import org.junit.Test;

/**
 * CREATE ：yulongsun
 * DATE ：2016/7/3
 * DESC:
 */
public class JingZhiTest {

    @Test
    public void testJingZhi() {
        int a = 0123;//八进制
        int b = 0x123;//十六进制
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void testChar() {
        char a = '中';
        int  i = a;
        System.out.println(i);//输出的是中文字符的Unicode编码


        //注意：Unicode编码兼容ASCII码




    }


}
