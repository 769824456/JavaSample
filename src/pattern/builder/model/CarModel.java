package pattern.builder.model;

import java.util.ArrayList;

/**
 * Created by yulongsun on 2016/5/16.
 * 汽车模型的抽象类
 */
public abstract class CarModel {

    //启动
    abstract void start();

    //停下来
    abstract void stop();

    //喇叭是会发出声音的
    abstract void alarm();

    //引擎实惠轰隆隆响的
    abstract void engineBoom();


    //各个基本方法的执行顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    final public void run() {

        for (int i = 0; i < sequence.size(); i++) {
            String actionName = sequence.get(i);

            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }


    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
