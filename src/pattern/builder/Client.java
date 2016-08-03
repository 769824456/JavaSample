package pattern.builder;

import pattern.builder.model.BenzModel;

import java.util.ArrayList;

/**
 * Created by yulongsun on 2016/5/16.
 */
public class Client {
    public static void main(String[] args) {
        BenzModel         benzModel   = new BenzModel();
        ArrayList<String> sequenceTmp = new ArrayList<String>();

        sequenceTmp.add("engine boom");
        sequenceTmp.add("start");
        sequenceTmp.add("stop");

        //把这个顺序给奔驰
        benzModel.setSequence(sequenceTmp);
        benzModel.run();
    }

}
