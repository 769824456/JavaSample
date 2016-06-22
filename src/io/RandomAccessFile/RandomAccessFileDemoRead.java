package io.RandomAccessFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by yulongsun on 2016/4/26.
 */
public class RandomAccessFileDemoRead {
    public static void main(String[] args) {
        File file = new File("C:/random");
        try {
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            String name = null;
            int age = 0;
            byte[] bytes = new byte[8];

            //2.
            raf.skipBytes(12);
            for (int i = 0; i < 8; i++) {
                bytes[i] = raf.readByte();
            }
            name = new String(bytes);
            age = raf.readInt();
            System.out.println("第二个人："+name+","+age);

            //1
            raf.seek(0);
            for (int i=0;i<8;i++){
                bytes[i]=raf.readByte();
            }
            name = new String(bytes);
            age = raf.readInt();
            System.out.println("第一个人："+name+","+age);


            //3.
            raf.skipBytes(12);
            for (int i=0;i<8;i++){
                bytes[i]=raf.readByte();
            }
            name = new String(bytes);
            age = raf.readInt();
            System.out.println("第三个人："+name+","+age);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
