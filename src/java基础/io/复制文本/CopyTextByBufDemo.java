package java基础.io.复制文本;

import org.junit.Test;

import java.io.*;

/**
 * CREATE ：yulongsun
 * DATE ：2016/7/2
 * DESC: 使用缓冲区复制文本
 */
public class CopyTextByBufDemo {


    public void copy01() throws Exception {
        FileReader     fr   = new FileReader(new File("abc.txt"));
        BufferedReader bufr = new BufferedReader(fr);


        FileWriter     fw   = new FileWriter(new File("abc_copy.txt"));
        BufferedWriter bufw = new BufferedWriter(fw);

        int ch = 0;
        //bufr.read()是直接区读， write是直接写到缓冲期
        while ((ch = bufr.read()) != -1) {
            bufw.write(ch);
        }

        bufr.close();
        bufw.close();
    }

    public void copy02() throws Exception {
        FileReader     fr   = new FileReader(new File("abc.txt"));
        BufferedReader bufr = new BufferedReader(fr);


        FileWriter     fw   = new FileWriter(new File("abc_copy02.txt"));
        BufferedWriter bufw = new BufferedWriter(fw);

        String line = null;
        while ((line = bufr.readLine()) != null) {
            bufw.write(line);
            bufw.newLine();//记得要换行
            bufw.flush();//记得要刷新
        }

        bufr.close();
        bufw.close();
    }


    @Test
    public void testCopy02() {
        try {
            copy02();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
