package pattern.builder.model;

/**
 * Created by yulongsun on 2016/5/16.
 * 宝马的实现类
 */
public class BMWModel extends CarModel {
    @Override
    void start() {
        System.out.println("宝马->开");
    }

    @Override
    void stop() {
        System.out.println("宝马->关");
    }

    @Override
    void alarm() {
        System.out.println("宝马->喇叭响");
    }

    @Override
    void engineBoom() {
        System.out.println("宝马->引擎响");
    }
}
