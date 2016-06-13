package pattern.builder.model;

/**
 * Created by yulongsun on 2016/5/16.
 * 奔驰的实现类
 */
public class BenzModel extends CarModel {
    @Override
    void start() {
        System.out.println("奔驰->开");
    }

    @Override
    void stop() {
        System.out.println("奔驰->停");
    }

    @Override
    void alarm() {
        System.out.println("奔驰->喇叭响");
    }

    @Override
    void engineBoom() {
        System.out.println("奔驰->引擎响");
    }
}
