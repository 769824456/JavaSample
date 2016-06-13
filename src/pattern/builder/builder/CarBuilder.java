package pattern.builder.builder;

import pattern.builder.model.CarModel;

import java.util.ArrayList;

/**
 * Created by yulongsun on 2016/5/16.
 */
public abstract class CarBuilder extends CarModel {
    //建造一个模型 你要给我一个顺序 就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //设置完顺序之后 就可以直接拿到这个车辆模型
    abstract CarModel getCarModel();
}
