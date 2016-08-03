package java基础.io.random;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by yulongsun on 2016/4/26.
 */
public class RandomAccessFileDemoWrite {
    public static void main(String[] args) {
        File file = new File("C:/random");
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            String name = null;
            int age = 0;
            name = "zhangsan";
            age = 30;
            raf.writeBytes(name);
            raf.writeInt(age);
            name = "lisi    ";
            age = 31;
            raf.writeBytes(name);
            raf.writeInt(age);
            name = "wangwu  ";
            age = 32;
            raf.writeBytes(name);
            raf.writeInt(age);
            raf.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
