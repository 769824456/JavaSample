package java基础.io.BufferReaderAndBufferWriter;

import org.junit.Test;

import java.io.*;

/**
 * CREATE ：yulongsun
 * DATE ：2016/7/1
 * DESC:
 */
public class BufferReaderedWriteredSample {

    /**
     * 缓冲区：
     * 目的：提高读取效率
     *
     * 前提：缓冲区在创建对象的时候必须得有个被缓冲的对象
     *
     * 作用: 底层就是封装数组
     */

    /**
     * BufferReader
     */
    public void bufferReader() {
//        BufferedReader reader = new BufferedReader();
    }

    /**
     * BufferWriter
     */
    public void bufferWriter() {
        try {
            FileWriter fw = new FileWriter("abc.txt");
            //缓冲区可以使用，也可以不使用
            BufferedWriter bufw = new BufferedWriter(fw);
            //注意：使用缓冲区的方法 写入到缓冲区中
            bufw.write("asd");
            bufw.newLine();//换行 只用BufferWritered有这个方法newLine
            bufw.write("hehehe");

            //将缓冲区中的数据刷到硬盘
            bufw.flush();


            //注意：关闭缓冲区就是 关闭了被缓冲的对象  就是fw.close
            bufw.close();
//            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    private String LINE_SEPARATOR = System.getProperty("line.separator");
    /**
     * BufferWriter
     */
    public void bufferWriter02() {
        try {
            FileWriter fw = new FileWriter("abc02.txt");
            //缓冲区可以使用，也可以不使用
            BufferedWriter bufw = new BufferedWriter(fw);
            //注意：使用缓冲区的方法 写入到缓冲区中
            bufw.write("asd" + LINE_SEPARATOR + "hahahah");

            //将缓冲区中的数据刷到硬盘
            bufw.flush();


            //注意：关闭缓冲区就是 关闭了被缓冲的对象  就是fw.close
            bufw.close();
//            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testBufferWriter() {
//        bufferWriter();
        bufferWriter02();
    }


}
