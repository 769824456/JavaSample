package pattern.builder.builder;

import pattern.builder.model.BMWModel;
import pattern.builder.model.CarModel;

import java.util.ArrayList;

/**
 * Created by yulongsun on 2016/5/16.
 */
public abstract class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    CarModel getCarModel() {
        return this.bmwModel;
    }
}
