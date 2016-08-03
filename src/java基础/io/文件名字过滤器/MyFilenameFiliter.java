package java基础.io.文件名字过滤器;

import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FilenameFilter;

/**
 * CREATE ：yulongsun
 * DATE ：2016/7/1
 * DESC: 文件名字过滤器
 */
public class MyFilenameFiliter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return true;
    }
}
