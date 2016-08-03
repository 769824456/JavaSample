package java基础.io.文件分割器;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * CREATE ：yulongsun
 * DATE ：2016/7/1
 * DESC: 文件分割器
 */
public class FileSplitUtil {

    /**
     * 文件切割
     *
     * @param file
     * @param size 每份大小 单位byte
     */
    public static void split(File file, int size) {
        try {
            FileInputStream fis = new FileInputStream(file);
            //缓存大小
            byte[] bytes = new byte[size];
            //输出目录
            File dir = new File("d://dir");
            if (!dir.exists())
                dir.mkdir();
            byte count = 1;
            while (fis.read(bytes) != -1) {
                //输出
                FileOutputStream fos = new FileOutputStream(new File(dir, (count++) + ".part"));
                fos.write(bytes);
                fos.close();
            }
            fis.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSplit() {
        File file = new File("D:\\OneDrive\\Android\\android图\\androidday01.bmp");
        split(file, 4096);
    }

    /**
     * 文件切割改进：
     * <p>
     * 需要改变切割好的文件名之后，还能按原顺序恢复原文件
     *
     * @param file
     * @param size
     */
    public static void split02(File file, int size) {
        try {
            FileInputStream fis = new FileInputStream(file);
            //缓存大小
            byte[] bytes = new byte[size];
            //输出目录
            File fileParts = new File("d://fileParts");
            if (!fileParts.exists())
                fileParts.mkdir();
            byte count = 1;
            int  len;
            while ((len = fis.read(bytes)) != -1) {
                //输出
                FileOutputStream fos = new FileOutputStream(new File(fileParts, (count++) + ".part"));
                fos.write(count);
                fos.write(bytes, 0, len);
                fos.close();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSplit02() {
        File file = new File("D:\\OneDrive\\Android\\android图\\androidday01.bmp");
        split02(file, 10240);
    }


    /**
     * 恢复切割的文件
     *
     * @param dir
     */
    public void merge(File dir) {
        if (!dir.exists()) {
            System.out.println("文件目录不存在");
            return;
        }
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            try {
                FileInputStream fis = new FileInputStream(new File(dir, (i + 1) + ".part"));
                byte[] flag = new byte[1];
                int    len  = fis.read(flag);
                if (len != -1) {
                    System.out.println("flag=" + new String(flag, 0, len));
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void testMerge() {
        File dir = new File("d://fileParts");
        merge(dir);
    }
}
